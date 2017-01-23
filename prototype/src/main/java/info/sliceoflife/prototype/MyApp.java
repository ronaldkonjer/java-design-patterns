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
