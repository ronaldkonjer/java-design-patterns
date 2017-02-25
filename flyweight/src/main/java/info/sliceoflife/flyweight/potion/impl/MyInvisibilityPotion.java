/*
 *
 */
package info.sliceoflife.flyweight.potion.impl;

import info.sliceoflife.flyweight.potion.MyPotion;

/**
 * InvisibilityPotion
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyInvisibilityPotion implements MyPotion {

  @Override
  public void drink() {
    System.out.println("You become invisible. (Potion=" + System.identityHashCode(this) + ")");
  }
}
