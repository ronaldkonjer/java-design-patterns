package info.sliceoflife.mediator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import info.sliceoflife.mediator.colleague.MyPartyMember;
import info.sliceoflife.mediator.mediator.impl.MyAction;
import info.sliceoflife.mediator.mediator.impl.MyPartyImpl;

import org.junit.Test;

public class MyPartyImplTest {

  /**
   * Verify if a member is notified when it's joining a party. Generate an action and see if the
   * other member gets it. Also check members don't get their own actions.
   */

  @Test
  public void testPartyAction() {
    final MyPartyMember partyMember1 = mock(MyPartyMember.class);
    final MyPartyMember partyMember2 = mock(MyPartyMember.class);

    final MyPartyImpl party = new MyPartyImpl();
    party.addMember(partyMember1);
    party.addMember(partyMember2);

    verify(partyMember1).joinedParty(party);
    verify(partyMember2).joinedParty(party);

    party.act(partyMember1, MyAction.GOLD);
    verifyZeroInteractions(partyMember1);
    verify(partyMember2).partyAction(MyAction.GOLD);

    verifyNoMoreInteractions(partyMember1, partyMember2);

  }

}
