package info.sliceoflife.command.receiver;

import info.sliceoflife.command.command.impl.MySize;
import info.sliceoflife.command.command.impl.MyVisibility;

/**
 * Base class for spell targets
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyTarget {

  private MySize size;
  private MyVisibility visibility;

  public MySize getSize() {
    return size;
  }

  public void setSize(final MySize size) {
    this.size = size;
  }

  public MyVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(final MyVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public abstract String toString();

  /**
   * Print status
   */
  public void printStatus() {
    System.out.println(String.format("%s, [size=%s] [visibility=%s]", this, getSize(), getVisibility()));
    System.out.println();
  }

}
