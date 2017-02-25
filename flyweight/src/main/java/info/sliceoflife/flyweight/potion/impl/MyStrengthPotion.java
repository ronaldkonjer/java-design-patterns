/*
 *
 */
package info.sliceoflife.flyweight.potion.impl;

import info.sliceoflife.flyweight.potion.MyPotion;

/**
 * StrengthPotion
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyStrengthPotion implements MyPotion {

  @Override
  public void drink() {
    System.out.println("You feel strong. (Potion=" + System.identityHashCode(this) + ")");
  }

}
