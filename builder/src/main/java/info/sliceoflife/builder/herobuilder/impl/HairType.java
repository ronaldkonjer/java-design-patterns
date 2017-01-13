package info.sliceoflife.builder.herobuilder.impl;

/**
 * HairType enumeration
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public enum HairType {

  BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straigt"), LONG_CURLY("long curly");

  private String title;

  HairType(final String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }

}
