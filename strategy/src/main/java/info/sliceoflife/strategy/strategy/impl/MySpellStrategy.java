package info.sliceoflife.strategy.strategy.impl;

import info.sliceoflife.strategy.strategy.MyDragonSlayingStrategy;

/**
 * The MySpellStrategy
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySpellStrategy implements MyDragonSlayingStrategy {

  @Override
  public void execute() {
    System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
  }

}
