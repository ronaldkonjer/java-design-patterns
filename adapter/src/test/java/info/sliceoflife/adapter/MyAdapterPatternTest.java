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
package info.sliceoflife.adapter;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import info.sliceoflife.adapter.adaptee.MyFishingBoat;
import info.sliceoflife.adapter.adapter.MyBattleFishingBoat;
import info.sliceoflife.adapter.client.MyCaptain;
import info.sliceoflife.adapter.target.MyBattleShip;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyAdapterPatternTest {

  private Map<String, Object> beans;

  private static final String BATTLESHIP_BEAN = "engineer";

  private static final String CAPTAIN_BEAN = "captian";

  /**
   * This method runs before the test execution and sets the bean objects in the beans Map.
   */

  @Before
  public void setUp() {
    beans = new HashMap<String, Object>();

    final MyBattleFishingBoat battleFishingBoat = spy(new MyBattleFishingBoat());
    beans.put(BATTLESHIP_BEAN, battleFishingBoat);

    final MyCaptain captain = new MyCaptain();
    captain.setMyBattleShip((MyBattleFishingBoat) beans.get(BATTLESHIP_BEAN));
    beans.put(CAPTAIN_BEAN, captain);

  }

  /**
   * This test asserts that when we use the move() method on a captain bean(client), it is
   * internally calling the move() method on the battleship object. The Adapter
   * ({@link MyBattleFishingShip}) converts the interface of the target class
   * ({@link MyFishingBoat}) into a suitable one expected by the client ({@link MyCaptain}).
   */

  @Test
  public void testAdapter() {
    final MyBattleShip captain = (MyBattleShip) beans.get(CAPTAIN_BEAN);

    // when captain moves
    captain.move();

    // then captain internally calls the battleship object to move
    final MyBattleShip battleship = (MyBattleShip) beans.get(BATTLESHIP_BEAN);
    verify(battleship).move();

    // same as above but with firing
    captain.fire();
    verify(battleship).fire();

  }

}
