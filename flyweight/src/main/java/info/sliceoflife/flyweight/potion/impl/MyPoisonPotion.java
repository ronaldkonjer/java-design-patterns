/*
 *
 */
package info.sliceoflife.flyweight.potion.impl;

import info.sliceoflife.flyweight.potion.MyPotion;

/**
 * PoisonPotion
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyPoisonPotion implements MyPotion {

  @Override
  public void drink() {
    System.out.println("Urgh! This is poisonous. (Potion=" + System.identityHashCode(this) + ")");
  }
}
