package info.siceoflife.bridge.implementor.impl;

import info.siceoflife.bridge.implementor.MyBlindingMagicWeaponImpl;

/**
 * MyExcalibur
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyExcalibur extends MyBlindingMagicWeaponImpl {

  @Override
  public void wieldImpl() {
    System.out.println("wielding Excalibur");
  }

  @Override
  public void swingImpl() {
    System.out.println("swinging Excalibur");
  }

  @Override
  public void unwieldImpl() {
    System.out.println("unwielding Excalibur");
  }

  @Override
  public void blindImpl() {
    System.out.println("bright light streams from Excalibur blinding the enemy");
  }

}
