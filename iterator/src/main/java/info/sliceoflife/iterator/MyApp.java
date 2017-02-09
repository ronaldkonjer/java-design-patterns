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
