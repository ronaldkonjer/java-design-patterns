/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package info.siceoflife.bridge;

import info.siceoflife.bridge.abstraction.MyMagicWeapon;
import info.siceoflife.bridge.abstraction.impl.MyBlindingMagicWeapon;
import info.siceoflife.bridge.abstraction.impl.MyFlyingMagicWeapon;
import info.siceoflife.bridge.abstraction.impl.MySoulEatingMagicWeapon;
import info.siceoflife.bridge.implementor.MyMagicWeaponImpl;
import info.siceoflife.bridge.implementor.impl.MyExcalibur;
import info.siceoflife.bridge.implementor.impl.MyMjollnir;
import info.siceoflife.bridge.implementor.impl.MyStormbringer;

/**
 * The Bridge pattern can also be thought of as two layers of abstraction. With Bridge, you
 * can decouple an abstraction from its implementation so that the two can vary independently.
 * <p>
 * In Bridge pattern both abstraction ({@link MyMagicWeapon}) and implementation
 * ({@link MyMagicWeaponImpl}) have their own class hierarchies. The interface of the
 * implementations can be changed without affecting the clients.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * Program entry points
   *
   * @param args command line args.
   */

  public static void main(final String[] args) {
    final MyBlindingMagicWeapon blindingMagicWeapon = new MyBlindingMagicWeapon(new MyExcalibur());
    blindingMagicWeapon.wield();
    blindingMagicWeapon.blind();
    blindingMagicWeapon.swing();
    blindingMagicWeapon.unwield();

    final MyFlyingMagicWeapon flyingMagicWeapon = new MyFlyingMagicWeapon(new MyMjollnir());
    flyingMagicWeapon.wield();
    flyingMagicWeapon.fly();
    flyingMagicWeapon.swing();
    flyingMagicWeapon.unwield();

    final MySoulEatingMagicWeapon soulEatingMagicWeapon = new MySoulEatingMagicWeapon(new MyStormbringer());
    soulEatingMagicWeapon.wield();
    soulEatingMagicWeapon.swing();
    soulEatingMagicWeapon.eatSoul();
    soulEatingMagicWeapon.unwield();

  }

}
