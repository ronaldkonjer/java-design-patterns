package info.siceoflife.bridge.implementor.impl;

import info.siceoflife.bridge.implementor.MyFlyingMagicWeaponImpl;

/**
 * Mjollnir
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyMjollnir extends MyFlyingMagicWeaponImpl {

  @Override
  public void wieldImpl() {
    System.out.println("wielding Mjollnir");
  }

  @Override
  public void swingImpl() {
    System.out.println("swinging Mjollnir");
  }

  @Override
  public void unwieldImpl() {
    System.out.println("unwielding Mjollnir");
  }

  @Override
  public void flyImpl() {
    System.out.println("Mjollnir hits the enemy in the air and returns back to the owner's hand");
  }

}
