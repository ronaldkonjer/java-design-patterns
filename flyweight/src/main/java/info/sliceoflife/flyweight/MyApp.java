/*
 *
 */
package info.sliceoflife.flyweight;

import info.sliceoflife.flyweight.client.MyAlchemistShop;
import info.sliceoflife.flyweight.factory.MyPotionFactory;

/**
 * The Flyweight Pattern is usefull when the program need a huge amount of objects. It provides
 * means to decrease resources usage by sharing object instances.
 * <p>
 * In this example {@link MyAlchemistShop} has great amount of potions on its shelves. To fill
 * the shelves {@link MyAlchemistShop} uses {@link MyPotionFactory} (which represents the Flyweight
 * in this example). Internally {@link MyPotionFactory} holds a map of the potions and lazily
 * creates
 * new potions when requested.
 * <p>
 * To enabe safe sharing, between clients and threads, Flyweight objects must be immutable.
 * Flyweight objects are by definition value objects.
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
    final MyAlchemistShop alchemistShop = new MyAlchemistShop();
    alchemistShop.enumerate();

  }

}
