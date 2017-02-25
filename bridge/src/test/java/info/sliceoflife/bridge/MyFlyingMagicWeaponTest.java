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
package info.sliceoflife.bridge;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;

import info.siceoflife.bridge.abstraction.impl.MyFlyingMagicWeapon;
import info.siceoflife.bridge.implementor.impl.MyMjollnir;

/**
 * MyFlyingMagicWeaponTest
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyFlyingMagicWeaponTest extends MyMagicWeaponTest {

  /**
   * Invokes all possible actions on the weapon and check if the actions are executed on the
   * actual underlying weapon implementation.
   */
  @Test
  public void testMyMjollnir() throws Exception {
    final MyMjollnir mjollnir = spy(new MyMjollnir());
    final MyFlyingMagicWeapon flyingMagicWeapon = new MyFlyingMagicWeapon(mjollnir);

    testMyBasicWeaponActions(flyingMagicWeapon, mjollnir);

    flyingMagicWeapon.fly();
    verify(mjollnir, times(1)).flyImpl();
    verifyNoMoreInteractions(mjollnir);

  }

}
