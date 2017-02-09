package info.siceoflife.bridge.abstraction.impl;

import info.siceoflife.bridge.abstraction.MyMagicWeapon;
import info.siceoflife.bridge.implementor.MyBlindingMagicWeaponImpl;

/**
 * MyBlindingMagicWeapon
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyBlindingMagicWeapon extends MyMagicWeapon {

  public MyBlindingMagicWeapon(final MyBlindingMagicWeaponImpl impl) {
    // references constructor of abstraction that maintains a reference to an object of type
    // Implementor
    super(impl);
  }

  // retrieves the concrete implementations of the classes that extend the Implementor
  @Override
  public MyBlindingMagicWeaponImpl getImpl() {
    return (MyBlindingMagicWeaponImpl) impl;
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

  public void blind() {
    getImpl().blindImpl();
  }

}
