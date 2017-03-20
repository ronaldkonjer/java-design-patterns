package info.sliceoflife.command.command;

import info.sliceoflife.command.receiver.MyTarget;

/**
 * Interface for Commands
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyCommand {

  public abstract void execute(MyTarget target);

  public abstract void undo();

  public abstract void redo();

  @Override
  public abstract String toString();

}
