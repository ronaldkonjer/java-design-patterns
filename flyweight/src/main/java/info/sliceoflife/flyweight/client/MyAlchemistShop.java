/*
 *
 */
package info.sliceoflife.flyweight.client;

import info.sliceoflife.flyweight.factory.MyPotionFactory;
import info.sliceoflife.flyweight.potion.MyPotion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * MyAlchemistShop holds potions on its shelves. It uses PotionFactory to provide the potions.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyAlchemistShop {

  List<MyPotion> topShelf;
  List<MyPotion> bottomShelf;

  /**
   * Constructor
   */
  public MyAlchemistShop() {
    topShelf = new ArrayList<>();
    bottomShelf = new ArrayList<>();
    fillShelves();
  }

  private void fillShelves() {

    final MyPotionFactory factory = new MyPotionFactory();
    topShelf.add(factory.createPotion(MyPotionType.INVISIBILITY));
    topShelf.add(factory.createPotion(MyPotionType.INVISIBILITY));
    topShelf.add(factory.createPotion(MyPotionType.STRENGTH));
    topShelf.add(factory.createPotion(MyPotionType.HEALING));
    topShelf.add(factory.createPotion(MyPotionType.INVISIBILITY));
    topShelf.add(factory.createPotion(MyPotionType.STRENGTH));
    topShelf.add(factory.createPotion(MyPotionType.HEALING));
    topShelf.add(factory.createPotion(MyPotionType.HEALING));

    bottomShelf.add(factory.createPotion(MyPotionType.POISON));
    bottomShelf.add(factory.createPotion(MyPotionType.POISON));
    bottomShelf.add(factory.createPotion(MyPotionType.POISON));
    bottomShelf.add(factory.createPotion(MyPotionType.HOLY_WATER));
    bottomShelf.add(factory.createPotion(MyPotionType.HOLY_WATER));
  }

  /**
   * Get a read-only list of all the items on the bottom shelf
   */
  public List<MyPotion> getBottomShelf() {
    return Collections.unmodifiableList(this.bottomShelf);
  }

  /**
   * Get a read-only list of all the items on the top shelf.
   */
  public List<MyPotion> getTopShelf() {
    return Collections.unmodifiableList(this.topShelf);
  }

  /**
   * Enumerate potions
   */
  public void enumerate() {
    System.out.println("Enumerating top shelf potions\n");

    for (final MyPotion p : topShelf) {
      p.drink();
    }

    System.out.println("\nEnumerating bottom shelf potions\n");
    // Java 8 lambda variation on the above foreach format
    bottomShelf.forEach(b -> b.drink());

  }

}
