package info.sliceoflife.factory.method.creator.impl;

import info.sliceoflife.factory.method.creator.MyBlacksmith;
import info.sliceoflife.factory.method.product.MyWeapon;
import info.sliceoflife.factory.method.product.impl.MyOrcWeapon;
import info.sliceoflife.factory.method.product.impl.MyWeaponType;

/**
 * Concrete subclass for creating new objects.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyOrcBlacksmith implements MyBlacksmith {

  @Override
  public MyWeapon manufactureWeapon(final MyWeaponType type) {
    return new MyOrcWeapon(type);
  }

}
