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
