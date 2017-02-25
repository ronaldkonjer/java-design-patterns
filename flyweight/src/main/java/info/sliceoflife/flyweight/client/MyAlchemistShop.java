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
