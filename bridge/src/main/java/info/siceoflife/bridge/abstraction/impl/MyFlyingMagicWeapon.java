package info.siceoflife.bridge.abstraction.impl;

import info.siceoflife.bridge.abstraction.MyMagicWeapon;
import info.siceoflife.bridge.implementor.MyFlyingMagicWeaponImpl;

public class MyFlyingMagicWeapon extends MyMagicWeapon {

  public MyFlyingMagicWeapon(final MyFlyingMagicWeaponImpl impl) {
    super(impl);
  }

  @Override
  public MyFlyingMagicWeaponImpl getImpl() {
    return (MyFlyingMagicWeaponImpl) impl;
  }

  @Override
  public void wield() {
    getImpl().wieldImpl();
  }

  @Override
  public void swing() {
    getImpl().swingImpl();
  }

  @Override
  public void unwield() {
    getImpl().unwieldImpl();
  }

  public void fly() {
    getImpl().flyImpl();
  }

}
