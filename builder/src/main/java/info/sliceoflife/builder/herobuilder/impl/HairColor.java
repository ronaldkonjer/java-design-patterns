package info.sliceoflife.builder.herobuilder.impl;

/**
 * HairColor enumeration
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public enum HairColor {

  WHITE, BLOND, RED, BROWN, BLACK;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
