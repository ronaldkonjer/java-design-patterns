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
package info.sliceoflife.prototype;

import info.sliceoflife.prototype.herofactory.MyHeroFactory;
import info.sliceoflife.prototype.herofactory.impl.MyHeroFactoryImpl;
import info.sliceoflife.prototype.heroprototype.impl.MyBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyElfBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyElfMage;
import info.sliceoflife.prototype.heroprototype.impl.MyElfWarlord;
import info.sliceoflife.prototype.heroprototype.impl.MyMage;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcMage;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcWarlord;
import info.sliceoflife.prototype.heroprototype.impl.MyWarlord;

/**
 * The prototype pattern is a creational design pattern in software development.
 * It is used when the type of objects to create is determined by a prototypical
 * instance, which is cloned to produce new objects.
 * The pattern is used to: - avoid subclasses of an object creator in the client
 * application, like the abstract factory pattern does. - avoid the inherent cost
 * creating a new object in the standard way (e.g.m using the 'new' keyword)
 * <p>
 * In this example we have a factory class {@link MyHeroFactoryImpl} producing
 * objects by cloning existing ones. The factory's prototype objects are given
 * as constructor parameters.
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
    MyHeroFactory factory;
    MyMage mage;
    MyWarlord warlord;
    MyBeast beast;

    factory = new MyHeroFactoryImpl(new MyElfMage(), new MyElfWarlord(), new MyElfBeast());
    mage = factory.createMage();
    warlord = factory.createWarlord();
    beast = factory.createBeast();
    System.out.println(mage);
    System.out.println(warlord);
    System.out.println(beast);

    factory = new MyHeroFactoryImpl(new MyOrcMage(), new MyOrcWarlord(), new MyOrcBeast());
    mage = factory.createMage();
    warlord = factory.createWarlord();
    beast = factory.createBeast();
    System.out.println(mage);
    System.out.println(warlord);
    System.out.println(beast);

  }

}
