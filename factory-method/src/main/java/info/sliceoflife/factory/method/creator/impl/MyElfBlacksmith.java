package info.sliceoflife.factory.method.creator.impl;

import info.sliceoflife.factory.method.creator.MyBlacksmith;
import info.sliceoflife.factory.method.product.MyWeapon;
import info.sliceoflife.factory.method.product.impl.MyElfWeapon;
import info.sliceoflife.factory.method.product.impl.MyWeaponType;

public class MyElfBlacksmith implements MyBlacksmith {

  @Override
  public MyWeapon manufactureWeapon(final MyWeaponType type) {
    return new MyElfWeapon(type);
  }

}
