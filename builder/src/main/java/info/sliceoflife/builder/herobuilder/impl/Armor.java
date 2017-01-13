package info.sliceoflife.builder.herobuilder.impl;

/**
 * Armor Enumeration
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public enum Armor {

  CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

  private String title;

  Armor(final String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
