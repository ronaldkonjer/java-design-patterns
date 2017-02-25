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
package info.sliceoflife.decorator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.sliceoflife.decorator.component.MyHostile;
import info.sliceoflife.decorator.component.impl.MyTroll;
import info.sliceoflife.decorator.decorator.MySmartHostile;

import org.junit.Test;

/**
 * MySmartHostile Test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySmartHostileTest {

  /**
   * Test the decorator MySmartHostile
   *
   * @throws Exception exception being thrown
   */
  @Test
  public void testMySmartHostile() throws Exception {
    // Create a normal troll first, but make sure we can spy on it later on.
    final MyHostile simpleTroll = spy(new MyTroll());

    // Now we want to deorate the troll to make it smarter ...
    final MyHostile smartTroll = new MySmartHostile(simpleTroll);
    assertEquals(30, smartTroll.getAttackPower());
    verify(simpleTroll, times(1)).getAttackPower();

    // Check if the smart troll actions are delegated to the decorated troll
    smartTroll.attack();
    verify(simpleTroll, times(1)).attack();

    smartTroll.fleeBattle();
    verify(simpleTroll, times(1)).fleeBattle();
    verifyNoMoreInteractions(simpleTroll);

  }

}
