package info.sliceoflife.strategy.strategy.impl;

import info.sliceoflife.strategy.strategy.MyDragonSlayingStrategy;

/**
 * The MyMeleeStrategy
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyMeleeStrategy implements MyDragonSlayingStrategy {

  @Override
  public void execute() {
    System.out.println("With your Excalibur you sever the dragon's head!");
  }

}
