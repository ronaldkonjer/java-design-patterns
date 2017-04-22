package info.sliceoflife.strategy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.sliceoflife.strategy.context.MyDragonSlayer;
import info.sliceoflife.strategy.strategy.MyDragonSlayingStrategy;

import org.junit.Test;

/**
 * MyDragonSlayer test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyDragonSlayerTest {

  /**
   * Verify if the dragon slayer uses the stategy during battle
   */
  @Test
  public void testGoToBattle() {
    final MyDragonSlayingStrategy strategy = mock(MyDragonSlayingStrategy.class);
    final MyDragonSlayer dragonSlayer = new MyDragonSlayer(strategy);

    dragonSlayer.goToBattle();
    verify(strategy).execute();
    verifyNoMoreInteractions(strategy);

  }

  /**
   * Verify if the dragon slayer uses the new strategy during battle after a change of strategy
   */
  @Test
  public void testChangeStrategy() throws Exception {
    final MyDragonSlayingStrategy initialStrategy = mock(MyDragonSlayingStrategy.class);
    final MyDragonSlayer dragonSlayer = new MyDragonSlayer(initialStrategy);

    dragonSlayer.goToBattle();
    verify(initialStrategy).execute();

    final MyDragonSlayingStrategy newStrategy = mock(MyDragonSlayingStrategy.class);
    dragonSlayer.changeStrategy(newStrategy);

    dragonSlayer.goToBattle();
    verify(newStrategy).execute();

    verifyNoMoreInteractions(initialStrategy, newStrategy);
  }

}
