package info.sliceoflife.command.command.impl;

/**
 * Enumeration for the target size
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public enum MySize {
  SMALL("Small"), NORMAL("Normal"), LARGE("Large"), UNDEFINED("");

  private String title;

  MySize(final String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }

}
