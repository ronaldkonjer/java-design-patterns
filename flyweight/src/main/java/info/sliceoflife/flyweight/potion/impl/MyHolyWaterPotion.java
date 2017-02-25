/*
 *
 */
package info.sliceoflife.flyweight.potion.impl;

import info.sliceoflife.flyweight.potion.MyPotion;

/**
 * HolyWaterPotion
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyHolyWaterPotion implements MyPotion {

  @Override
  public void drink() {
    System.out.println("You feel blessed. (Potion=" + System.identityHashCode(this) + ")");
  }
}
