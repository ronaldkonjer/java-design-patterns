package info.sliceoflife.mediator.mediator;

import info.sliceoflife.mediator.colleague.MyPartyMember;
import info.sliceoflife.mediator.mediator.impl.MyAction;

/**
 * MyParty interface.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public interface MyParty {

  void addMember(MyPartyMember member);

  void act(MyPartyMember member, MyAction action);

}
