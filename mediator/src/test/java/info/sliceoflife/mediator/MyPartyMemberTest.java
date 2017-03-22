package info.sliceoflife.mediator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import info.sliceoflife.mediator.colleague.MyPartyMember;
import info.sliceoflife.mediator.colleague.impl.MyHobbit;
import info.sliceoflife.mediator.colleague.impl.MyHunter;
import info.sliceoflife.mediator.colleague.impl.MyRogue;
import info.sliceoflife.mediator.colleague.impl.MyWizard;
import info.sliceoflife.mediator.mediator.MyParty;
import info.sliceoflife.mediator.mediator.impl.MyAction;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MyPartyMemberTest {

  @Parameterized.Parameters
  public static Collection<Supplier<MyPartyMember>[]> data() {
    return Arrays.asList(
        new Supplier[] {MyHobbit::new},
        new Supplier[] {MyHunter::new},
        new Supplier[] {MyRogue::new},
        new Supplier[] {MyWizard::new});
  }

  /**
   * The mocked standard out {@link PrintStream}, required since some actions on a {@link
   * MyPartyMember} have not got any influence on any other accessible objects, except for writing
   * to
   * std-out using {@link System#out}
   */
  private final PrintStream stdOutMock = mock(PrintStream.class);

  /**
   * Keep the original std-out so it can be restored after the test
   */
  private final PrintStream stdOutOrig = System.out;

  /**
   * Inject the mocked std-out {@link PrintStream} into the {@link System} class before each test
   */
  @Before
  public void setUp() {
    System.setOut(this.stdOutMock);
  }

  /**
   * Removed the mocked std-out {@link PrintStream} again from the {@link System} class
   */
  @After
  public void tearDown() {
    System.setOut(this.stdOutOrig);
  }

  /**
   * THe factory, used to create a new instance of the tested party member
   */
  private final Supplier<MyPartyMember> memberSupplier;

  /**
   * Create a new test instance, using the given {@link MyPartyMember} factory
   *
   * @param memberSupplier The party member factory
   */
  public MyPartyMemberTest(final Supplier<MyPartyMember> memberSupplier) {
    this.memberSupplier = memberSupplier;
  }

  /**
   * Verify if a party action triggers the correct output to the std-Out
   */
  @Test
  public void testPartyAction() {
    final MyPartyMember member = this.memberSupplier.get();

    for (final MyAction action : MyAction.values()) {
      member.partyAction(action);
      verify(this.stdOutMock).println(member.toString() + " " + action.getDescription());
    }
    verifyNoMoreInteractions(this.stdOutMock);
  }

  /**
   * Verify if a member action triggers the expected interactions with the party class
   */
  @Test
  public void testAct() {
    final MyPartyMember member = this.memberSupplier.get();

    member.act(MyAction.GOLD);
    verifyZeroInteractions(this.stdOutMock);

    final MyParty party = mock(MyParty.class);
    member.joinedParty(party);
    verify(this.stdOutMock).println(member.toString() + " joins the party");

    for (final MyAction action : MyAction.values()) {
      member.act(action);
      verify(this.stdOutMock).println(member.toString() + " " + action.toString());
      verify(party).act(member, action);
    }
    verifyNoMoreInteractions(party, this.stdOutMock);
  }

  /**
   * Verify if {@link MyPartyMember#toString()} generate the expected output
   */
  @Test
  public void testToString() throws Exception {
    final MyPartyMember member = this.memberSupplier.get();
    final Class<? extends MyPartyMember> memberClass = member.getClass();
    assertEquals(memberClass.getSimpleName(), member.toString());
  }
}
