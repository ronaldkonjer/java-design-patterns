package info.sliceoflife.factory.method.product.impl;

/**
 * WeaponType enumeration to refactor if/else if/else
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public enum MyWeaponType {

  SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

  private String title;

  private MyWeaponType(final String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
