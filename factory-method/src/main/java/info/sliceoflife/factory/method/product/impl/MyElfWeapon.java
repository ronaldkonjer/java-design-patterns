package info.sliceoflife.factory.method.product.impl;

import info.sliceoflife.factory.method.product.MyWeapon;

/**
 * Concrete implementation of the ElfWeapon
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyElfWeapon implements MyWeapon {

  private final MyWeaponType weaponType;

  public MyElfWeapon(final MyWeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public MyWeaponType getWeaponType() {
    return weaponType;
  }

  @Override
  public String toString() {
    return "Elfish " + weaponType;
  }

}
