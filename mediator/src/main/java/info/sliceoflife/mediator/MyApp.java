package info.sliceoflife.mediator;

import info.sliceoflife.mediator.colleague.impl.MyHobbit;
import info.sliceoflife.mediator.colleague.impl.MyHunter;
import info.sliceoflife.mediator.colleague.impl.MyRogue;
import info.sliceoflife.mediator.colleague.impl.MyWizard;
import info.sliceoflife.mediator.mediator.MyParty;
import info.sliceoflife.mediator.mediator.impl.MyAction;
import info.sliceoflife.mediator.mediator.impl.MyPartyImpl;

/**
 * The Mediator Pattern defines an object that encapsulates how a set of objects interact. This
 * pattern is considered to be a behavioral pattern due to the way it can alter the program's
 * running behavior.
 * <p>
 * Usually a program is made up of a large number of classes. So the logic and computation is
 * distributed among these classes. However, as more classes are developed is a program, especially
 * during maintenance and/or refactoring, the problem of communication between these classes may
 * become complex. This makes the program harder to read and maintain. Futhermore, it can become
 * difficult to change the program, since any change may affect code in several other classes.
 * <p>
 * With the Mediator pattern, communication between objects is encapsulated with a Mediator object.
 * Objects no longer communicate directly with each other, but instead communicate through the
 * Mediator. This reduces the dependencies between communicating objects, thereby lowering the
 * coupling.
 * <p>
 * In this example the Mediator encapsulates how a set of objects ({@link MyPartyMembers}) interact.
 * Instead of referring to each other directly they use the Mediator ({@link MyParty}) interface.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(final String[] args) {

    // create party and members
    final MyParty party = new MyPartyImpl();
    final MyHobbit hobbit = new MyHobbit();
    final MyWizard wizard = new MyWizard();
    final MyRogue rogue = new MyRogue();
    final MyHunter hunter = new MyHunter();

    // add party members
    party.addMember(hobbit);
    party.addMember(wizard);
    party.addMember(rogue);
    party.addMember(hunter);

    // perform actions -> the other party members
    // are notified by the party
    hobbit.act(MyAction.ENEMY);
    wizard.act(MyAction.TALE);
    rogue.act(MyAction.GOLD);
    hunter.act(MyAction.HUNT);

  }

}
