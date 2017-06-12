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
package info.sliceoflife.command;

import static org.junit.Assert.assertEquals;

import info.sliceoflife.command.command.impl.MyInvisibilitySpell;
import info.sliceoflife.command.command.impl.MyShrinkSpell;
import info.sliceoflife.command.command.impl.MySize;
import info.sliceoflife.command.command.impl.MyVisibility;
import info.sliceoflife.command.invoker.MyWizard;
import info.sliceoflife.command.receiver.impl.MyGoblin;

import org.junit.Test;

/**
 * The Command Pattern is a behavioral design pattern in which an object is used to encapsulate all
 * information needed to perform an action or trigger an event at a later time. This information
 * includes the method name, the object that owns the method and values for the method parameters.
 * <p>
 * Four terms always associated with the Command Pattern are command, receiver, invoker and client.
 * A Command object (spell) knows about the receiver (target) and invokes a method of the receiver.
 * Values for parameters of the receiver method are stored in the command. The receiver
 * then does the work. An invoker object (Wizard) knows hot to execute a command, and optionally
 * does bookkeeping about the command execution. The invoker does not know anything about the
 * concrete command, it knows only about command interface. Both an invoker object and several
 * command objects are held by a client object (MyApp). The client decides which commands to execute
 * at which points. To execute a command, it passes the command object to the invoker object.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyCommandTest {

  private static final String GOBLIN = "Goblin";

  /**
   * This test verifies that when the wizard casts spells on the goblin. The wizard keeps track of
   * the
   * previous spells cast, so it is easy to undo them. In addition, it also verifies that the wizard
   * keeps track of the spells undone, so they can be redone.
   */
  @Test
  public void testCommand() {
    final MyWizard wizard = new MyWizard();
    final MyGoblin goblin = new MyGoblin();

    wizard.castSpell(new MyShrinkSpell(), goblin);
    verifyGoblin(goblin, GOBLIN, MySize.SMALL, MyVisibility.VISIBLE);

    wizard.castSpell(new MyInvisibilitySpell(), goblin);
    verifyGoblin(goblin, GOBLIN, MySize.SMALL, MyVisibility.INVISIBLE);

    wizard.undoLastSpell();
    verifyGoblin(goblin, GOBLIN, MySize.SMALL, MyVisibility.VISIBLE);

    wizard.undoLastSpell();
    verifyGoblin(goblin, GOBLIN, MySize.NORMAL, MyVisibility.VISIBLE);

    wizard.redoLastSpell();
    verifyGoblin(goblin, GOBLIN, MySize.SMALL, MyVisibility.VISIBLE);

    wizard.redoLastSpell();
    verifyGoblin(goblin, GOBLIN, MySize.SMALL, MyVisibility.INVISIBLE);
  }

  private void verifyGoblin(final MyGoblin goblin, final String expectedName, final MySize expectedSize,
      final MyVisibility expectedVisibility) {
    assertEquals("Goblin's name must be same as expectedName", expectedName, goblin.toString());
    assertEquals("Goblin's size must be same as expectedSize", expectedSize, goblin.getSize());
    assertEquals("Goblin's visibility must be same as expectedVisibility", expectedVisibility,
        goblin.getVisibility());
  }

}
