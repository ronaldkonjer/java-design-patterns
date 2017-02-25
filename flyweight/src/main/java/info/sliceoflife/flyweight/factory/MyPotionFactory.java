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
