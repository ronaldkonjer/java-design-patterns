package info.sliceoflife.flyweight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import info.sliceoflife.flyweight.client.MyAlchemistShop;
import info.sliceoflife.flyweight.potion.MyPotion;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * MyAlchemistShop test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyAlchemistShopTest {

  @Test
  public void testShop() {
    final MyAlchemistShop shop = new MyAlchemistShop();

    final List<MyPotion> bottomShelf = shop.getBottomShelf();
    assertNotNull(bottomShelf);
    assertEquals(5, bottomShelf.size());

    final List<MyPotion> topShelf = shop.getTopShelf();
    assertNotNull(topShelf);
    assertEquals(8, topShelf.size());

    final List<MyPotion> allPotions = new ArrayList<>();
    allPotions.addAll(topShelf);
    allPotions.addAll(bottomShelf);

    // There are 13 potions instances, but only 5 unique instance types.
    assertEquals(13, allPotions.size());
    assertEquals(5, allPotions.stream()
      .map(System::identityHashCode)
      .distinct()
      .count());

  }

}
