package info.sliceoflife.command.command.impl;

import info.sliceoflife.command.command.MyCommand;
import info.sliceoflife.command.receiver.MyTarget;

/**
 * MyInvisibilitySpell is a concrete command
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyInvisibilitySpell extends MyCommand {

  private MyTarget target;

  @Override
  public void execute(final MyTarget target) {
    target.setVisibility(MyVisibility.INVISIBLE);
    this.target = target;

  }

  @Override
  public void undo() {
    if (target != null) {
      target.setVisibility(MyVisibility.VISIBLE);
    }

  }

  @Override
  public void redo() {
    if (target != null) {
      target.setVisibility(MyVisibility.INVISIBLE);
    }

  }

  @Override
  public String toString() {
    return "Invisibility spell";
  }

}
