package info.sliceoflife.strategy.strategy.impl;

import info.sliceoflife.strategy.strategy.MyDragonSlayingStrategy;

/**
 * The MyProjecileStrategy
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyProjectileStrategy implements MyDragonSlayingStrategy {

  @Override
  public void execute() {
    System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
  }

}
