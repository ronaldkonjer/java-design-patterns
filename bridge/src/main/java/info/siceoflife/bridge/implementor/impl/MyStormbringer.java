package info.siceoflife.bridge.implementor.impl;

import info.siceoflife.bridge.implementor.MySoulEatingMagicWeaponImpl;

/**
 * MyStormbringer
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyStormbringer extends MySoulEatingMagicWeaponImpl {

  @Override
  public void wieldImpl() {
    System.out.println("wielding Stormbringer");
  }

  @Override
  public void swingImpl() {
    System.out.println("swinging Stormbringer");
  }

  @Override
  public void unwieldImpl() {
    System.out.println("unwielding Stormbringer");
  }

  @Override
  public void eatSoulImpl() {
    System.out.println("Stormbringer devours the enemy's soul");
  }

}
