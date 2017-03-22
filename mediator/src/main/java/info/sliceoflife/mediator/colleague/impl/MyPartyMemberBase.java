package info.sliceoflife.mediator.colleague.impl;

import info.sliceoflife.mediator.colleague.MyPartyMember;
import info.sliceoflife.mediator.mediator.MyParty;
import info.sliceoflife.mediator.mediator.impl.MyAction;

/**
 * Abstract base class for party members.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public abstract class MyPartyMemberBase implements MyPartyMember {

  protected MyParty party;

  @Override
  public void joinedParty(final MyParty party) {
    System.out.println(this + " joins the party");
    this.party = party;
  }

  @Override
  public void partyAction(final MyAction action) {
    System.out.println(this + " " + action.getDescription());

  }

  @Override
  public void act(final MyAction action) {
    if (party != null) {
      System.out.println(this + " " + action.toString());
      party.act(this, action);
    }
  }

  @Override
  public abstract String toString();

}
