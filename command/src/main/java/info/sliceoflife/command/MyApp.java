package info.sliceoflife.command;

import info.sliceoflife.command.command.impl.MyInvisibilitySpell;
import info.sliceoflife.command.command.impl.MyShrinkSpell;
import info.sliceoflife.command.invoker.MyWizard;
import info.sliceoflife.command.receiver.impl.MyGoblin;

/**
 * The Command Pattern is a behavioral design pattern in which an object is used to encapsulate
 * all information needed to perform an action or trigger and event at a later time. This
 * information
 * includes the method name, the object that owns the method and values for the method parameters.
 * <p>
 * Four terms always associated with the Command Pattern are Command, Receiver, Invoker and Client.
 * A Command Object (Spell) knows about the Receiver(Target) and Invokes a method of the receiver.
 * Values for parameter of the receiver method are stored in the command. The receiver then does the
 * work, An Invoker object (Wizzard) knows how to execute a command, and optionally does bookkeeping
 * about the command execution. The invoker does not know anything about a concrete command, it
 * knows
 * only about command interface. Both an invoker object and several command objects are held by a
 * client object (APP). The client decides which commands to execute at which points. To execute
 * a command, it passes the command object to the invoker object.
 * <p>
 * In other words, in this example the Wizard casts spells on the Goblin. The Wizard keeps track of
 * the previous spells cast, so it is easy to undo them. In addition, the Wizard keeps track of the
 * spells undone, so they can be redone.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyApp {

  /**
   * program entry point
   * 
   * @param args command line args
   */

  public static void main(final String[] args) {
    final MyWizard wizard = new MyWizard();
    final MyGoblin goblin = new MyGoblin();

    goblin.printStatus();

    wizard.castSpell(new MyShrinkSpell(), goblin);
    goblin.printStatus();

    wizard.castSpell(new MyInvisibilitySpell(), goblin);
    goblin.printStatus();

    wizard.undoLastSpell();
    goblin.printStatus();

    wizard.undoLastSpell();
    goblin.printStatus();

    wizard.redoLastSpell();
    goblin.printStatus();

    wizard.redoLastSpell();
    goblin.printStatus();

  }

}
