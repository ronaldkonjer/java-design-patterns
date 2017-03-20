package info.sliceoflife.command.command.impl;

import info.sliceoflife.command.command.MyCommand;
import info.sliceoflife.command.receiver.MyTarget;

/**
 * MyShrinkSpell is a concrete command
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyShrinkSpell extends MyCommand {

  private MySize oldSize;
  private MyTarget target;

  @Override
  public void execute(final MyTarget target) {
    oldSize = target.getSize();
    target.setSize(MySize.SMALL);
    this.target = target;
  }

  @Override
  public void undo() {
    if (oldSize != null && target != null) {
      final MySize temp = target.getSize();
      target.setSize(oldSize);
      oldSize = temp;
    }

  }

  @Override
  public void redo() {
    undo();

  }

  @Override
  public String toString() {
    return "Shrink spell";
  }

}
