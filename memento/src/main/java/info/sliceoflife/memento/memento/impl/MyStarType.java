package info.sliceoflife.memento.memento.impl;

/**
 * MyStarType enumeration
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public enum MyStarType {
  SUN("sun"), RED_GIANT("red giant"), WHITE_DWARF("white dwarf"), SUPERNOVA("supernova"), DEAD_STAR(
      "dead star"), UNDEFINED("");

  private String title;

  MyStarType(final String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }

}
