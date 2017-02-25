package info.sliceoflife.decorator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.sliceoflife.decorator.component.impl.MyTroll;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Component test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyTrollTest {

  /**
   * The mocked standard out stream, required since the actions don't have any influence on
   * other objects, except for writing to the std-out using {@link System#out}
   */
  private final PrintStream stdOutMock = mock(PrintStream.class);

  /**
   * Keep the original std-out so it can be restored after the test
   */
  private final PrintStream stdOutOrig = System.out;

  /**
   * Inject the mocked std-out {@link PrintStream} into the {@link System} class before each
   * test
   */
  @Before
  public void setUp() {
    System.setOut(this.stdOutMock);
  }

  /**
   * Remove the mocked std-out {@link PrintStream} again from the {@link System} class
   */
  @After
  public void tearDown() {
    System.setOut(this.stdOutOrig);
  }

  /**
   * Test the troll object methods
   *
   * @throws Exception exception being thrown
   */
  @Test
  public void testMyTrollActions() throws Exception {
    final MyTroll troll = new MyTroll();
    assertEquals(10, troll.getAttackPower());

    troll.attack();
    verify(this.stdOutMock, times(1)).println(eq("The troll swings at you with a club!"));

    troll.fleeBattle();
    verify(this.stdOutMock, times(1)).println(eq("The troll shrieks in horror and runs away!"));

    verifyNoMoreInteractions(this.stdOutMock);
  }

}
