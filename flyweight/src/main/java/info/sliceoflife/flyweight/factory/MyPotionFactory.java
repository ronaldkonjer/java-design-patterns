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
package info.sliceoflife.flyweight.factory;

import info.sliceoflife.flyweight.client.MyPotionType;
import info.sliceoflife.flyweight.potion.MyPotion;
import info.sliceoflife.flyweight.potion.impl.MyHealingPotion;
import info.sliceoflife.flyweight.potion.impl.MyHolyWaterPotion;
import info.sliceoflife.flyweight.potion.impl.MyInvisibilityPotion;
import info.sliceoflife.flyweight.potion.impl.MyPoisonPotion;
import info.sliceoflife.flyweight.potion.impl.MyStrengthPotion;

import java.util.EnumMap;
import java.util.Map;

/**
 * PotionFactory is the Flyweight in this example. It minimizes memory use by sharing object
 * instances. It holds a map of potion instances and new potions are created only when none of
 * the type already exists
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyPotionFactory {

  Map<MyPotionType, MyPotion> potions;

  public MyPotionFactory() {
    potions = new EnumMap<>(MyPotionType.class);
  }

  /**
   * Portion creation class
   */
  public MyPotion createPotion(final MyPotionType type) {
    MyPotion potion = potions.get(type);
    if (potion == null) {
      switch (type) {
        case HEALING:
          potion = new MyHealingPotion();
          potions.put(type, potion);
          break;
        case HOLY_WATER:
          potion = new MyHolyWaterPotion();
          potions.put(type, potion);
          break;
        case INVISIBILITY:
          potion = new MyInvisibilityPotion();
          potions.put(type, potion);
          break;
        case POISON:
          potion = new MyPoisonPotion();
          potions.put(type, potion);
          break;
        case STRENGTH:
          potion = new MyStrengthPotion();
          potions.put(type, potion);
          break;
        default:
          break;
      }
    }
    return potion;
  }
}
