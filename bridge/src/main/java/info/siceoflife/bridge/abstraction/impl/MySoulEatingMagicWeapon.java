package info.siceoflife.bridge.abstraction.impl;

import info.siceoflife.bridge.abstraction.MyMagicWeapon;
import info.siceoflife.bridge.implementor.MySoulEatingMagicWeaponImpl;

/**
 * MySoulEatingMagicWeapon
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MySoulEatingMagicWeapon extends MyMagicWeapon {

  public MySoulEatingMagicWeapon(final MySoulEatingMagicWeaponImpl impl) {
    super(impl);
  }

  @Override
  public MySoulEatingMagicWeaponImpl getImpl() {
    return (MySoulEatingMagicWeaponImpl) impl;
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

  public void eatSoul() {
    getImpl().eatSoulImpl();
  }
}
