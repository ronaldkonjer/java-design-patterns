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
package info.sliceoflife.templatemethod;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.sliceoflife.templatemethod.client.MyHalflingThief;
import info.sliceoflife.templatemethod.template.MyStealingMethod;

import org.junit.Test;

/**
 * Test for the MyHalflingThief
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyHalflingThiefTest {

  /**
   * Verify if the thief uses the provided stealing method
   */

  @Test
  public void testSteal() {
    final MyStealingMethod method = mock(MyStealingMethod.class);
    final MyHalflingThief thief = new MyHalflingThief(method);

    thief.steal();
    verify(method).steal();

    verifyNoMoreInteractions(method);
  }

  /**
   * Verify if the thief uses the provided stealing method, and the new method after changing it
   */
  @Test
  public void testChangeMethod() {
    final MyStealingMethod initialMethod = mock(MyStealingMethod.class);
    final MyHalflingThief thief = new MyHalflingThief(initialMethod);

    thief.steal();
    verify(initialMethod).steal();

    final MyStealingMethod newMethod = mock(MyStealingMethod.class);
    thief.changeMethod(newMethod);

    thief.steal();
    verify(newMethod).steal();

    verifyNoMoreInteractions(initialMethod, newMethod);
  }

}
