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
package info.sliceoflife.adapter.adapter;

import info.sliceoflife.adapter.adaptee.MyFishingBoat;
import info.sliceoflife.adapter.client.MyCaptain;
import info.sliceoflife.adapter.target.MyBattleShip;

/**
 * Adapter class. Adapt the interface of the device ({@link MyFishingBoat}) into
 * ({@link MyBattleShip}) interface expected by the client ({@link MyCaptain}).
 * In this case we added a new function fire to suit the interface. We are reusing the
 * {@link MyFishingBoat} without changing itself. The adapter cass can just map the functions
 * of the Adaptee or add, delete features of the Adaptee
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyBattleFishingBoat implements MyBattleShip {

  private final MyFishingBoat boat;

  public MyBattleFishingBoat() {
    boat = new MyFishingBoat();
  }

  @Override
  public void fire() {
    System.out.println("fire!");
  }

  @Override
  public void move() {
    boat.sail();
  }

}
