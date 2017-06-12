/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
