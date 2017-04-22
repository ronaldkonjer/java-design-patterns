package info.sliceoflife.strategy.context;

import info.sliceoflife.strategy.strategy.MyDragonSlayingStrategy;

/**
 * MyDragonSlayer uses diffent strategies to slay the dragon.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyDragonSlayer {

  private MyDragonSlayingStrategy strategy;

  public MyDragonSlayer(final MyDragonSlayingStrategy strategy) {
    this.strategy = strategy;
  }

  public void goToBattle() {
    strategy.execute();
  }

  public void changeStrategy(final MyDragonSlayingStrategy strategy) {
    this.strategy = strategy;

  }

}
