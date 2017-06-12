/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
