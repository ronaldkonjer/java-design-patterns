package info.sliceoflife.command.invoker;

import info.sliceoflife.command.command.MyCommand;
import info.sliceoflife.command.receiver.MyTarget;

import java.util.Deque;
import java.util.LinkedList;

/**
 * The MyWizard is the invoker of the commands
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyWizard {

  private final Deque<MyCommand> undoStack = new LinkedList<>();
  private final Deque<MyCommand> redoStack = new LinkedList<>();

  /**
   * Cast spell
   */
  public void castSpell(final MyCommand command, final MyTarget target) {
    System.out.println(this + " casts " + command + " at " + target);
    command.execute(target);
    undoStack.offerLast(command);
  }

  /**
   * Undo last spell
   */
  public void undoLastSpell() {
    if (!undoStack.isEmpty()) {
      final MyCommand previousSpell = undoStack.pollLast();
      redoStack.offerLast(previousSpell);
      System.out.println(this + " undoes " + previousSpell);
      previousSpell.undo();
    }
  }

  /**
   * Redo last spell
   */
  public void redoLastSpell() {
    if (!redoStack.isEmpty()) {
      final MyCommand previousSpell = redoStack.pollLast();
      undoStack.offerLast(previousSpell);
      System.out.println(this + " redoes " + previousSpell);
      previousSpell.redo();
    }
  }

  @Override
  public String toString() {
    return "Wizard";
  }

}
