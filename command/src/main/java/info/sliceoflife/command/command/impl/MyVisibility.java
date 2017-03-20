package info.sliceoflife.command.command.impl;

/**
 * Enumeration for target visibility
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public enum MyVisibility {
  VISIBLE("visible"), INVISIBLE("invisible"), UNDEFINED("");

  private String title;

  MyVisibility(final String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }

}
