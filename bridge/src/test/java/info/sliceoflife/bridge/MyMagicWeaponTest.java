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

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.siceoflife.bridge.abstraction.MyMagicWeapon;
import info.siceoflife.bridge.implementor.MyMagicWeaponImpl;

public abstract class MyMagicWeaponTest {

  /**
   * Invoke the basic actions of the given weapon, and test if the underlying weapon
   * implementation is invoked
   *
   * @param weaponImpl The spied weapon implementation where actions are bridged to
   * @param weapon The weapon, handled by the MyApp
   */

  protected final void testMyBasicWeaponActions(final MyMagicWeapon weapon,
      final MyMagicWeaponImpl weaponImpl) {
    assertNotNull(weapon);
    assertNotNull(weaponImpl);
    assertNotNull(weapon.getImpl());

    weapon.swing();
    verify(weaponImpl, times(1)).swingImpl();
    verifyNoMoreInteractions(weaponImpl);

    weapon.wield();
    verify(weaponImpl, times(1)).wieldImpl();
    verifyNoMoreInteractions(weaponImpl);

    weapon.unwield();
    verify(weaponImpl, times(1)).unwieldImpl();
    verifyNoMoreInteractions(weaponImpl);
  }

}
