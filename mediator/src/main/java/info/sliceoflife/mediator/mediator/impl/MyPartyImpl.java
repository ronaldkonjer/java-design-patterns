package info.sliceoflife.mediator.mediator.impl;

import info.sliceoflife.mediator.colleague.MyPartyMember;
import info.sliceoflife.mediator.mediator.MyParty;

import java.util.ArrayList;
import java.util.List;

/**
 * MyParty implementation.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyPartyImpl implements MyParty {

  private final List<MyPartyMember> members;

  public MyPartyImpl() {
    members = new ArrayList<>();
  }

  @Override
  public void addMember(final MyPartyMember member) {
    members.add(member);
    member.joinedParty(this);

  }

  @Override
  public void act(final MyPartyMember actor, final MyAction action) {
    for (final MyPartyMember member : members) {
      if (!member.equals(actor)) {
        member.partyAction(action);
      }
    }

  }

}
