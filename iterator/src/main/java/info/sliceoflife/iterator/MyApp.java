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
package info.sliceoflife.iterator;

import info.sliceoflife.iterator.aggregate.MyTreasureChest;
import info.sliceoflife.iterator.item.MyItemType;
import info.sliceoflife.iterator.iterator.MyItemIterator;

/**
 * The Iterator Pattern is a design pattern in which an iterator is used to traverse a container
 * and access the container's elements. The Iterator Pattern decouples algorithms from containers.
 * <p>
 * In this example the Iterator ({@link MyItemIterator}) adds an abstraction layer on top of a
 * collection ({@link MyTreasureChest}). This way the collection can change its internal
 * implementation without affecting its clients.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyApp {

  /**
   * Program entry point
   *
   * @param args command line args
   */

  public static void main(final String[] args) {
    final MyTreasureChest chest = new MyTreasureChest();

    final MyItemIterator ringIterator = chest.iterator(MyItemType.RING);
    while (ringIterator.hasNext()) {
      System.out.println(ringIterator.next());
    }

    System.out.println("----------");

    final MyItemIterator potionIterator = chest.iterator(MyItemType.POTION);
    while (potionIterator.hasNext()) {
      System.out.println(potionIterator.next());
    }

    System.out.println("----------");

    final MyItemIterator weaponIterator = chest.iterator(MyItemType.WEAPON);
    while (weaponIterator.hasNext()) {
      System.out.println(weaponIterator.next());
    }

    System.out.println("----------");

    final MyItemIterator it = chest.iterator(MyItemType.ANY);
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

}
