package info.siceoflife.bridge.abstraction;

import info.siceoflife.bridge.implementor.MyMagicWeaponImpl;

/**
 * MyMagicWeapon
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public abstract class MyMagicWeapon {

  // maintains a reference to an object of type Implementor
  protected MyMagicWeaponImpl impl;

  public MyMagicWeapon(final MyMagicWeaponImpl impl) {
    this.impl = impl;
  }

  public abstract void swing();

  public abstract void wield();

  public abstract void unwield();

  public MyMagicWeaponImpl getImpl() {
    return impl;
  }

}
