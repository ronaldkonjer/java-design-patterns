package info.sliceoflife.mediator.colleague;

import info.sliceoflife.mediator.mediator.MyParty;
import info.sliceoflife.mediator.mediator.impl.MyAction;

/**
 * Interface for party members interacting with {@link MyParty}
 */

public interface MyPartyMember {

  void joinedParty(MyParty party);

  void partyAction(MyAction action);

  void act(MyAction action);

}
