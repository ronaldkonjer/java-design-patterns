/*
 *
 */
package info.sliceoflife.flyweight.potion.impl;

import info.sliceoflife.flyweight.potion.MyPotion;

/**
 * HealingPotion
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyHealingPotion implements MyPotion {

  @Override
  public void drink() {
    System.out.println("You feel healed. (Potion=" + System.identityHashCode(this) + ")");
  }
}
