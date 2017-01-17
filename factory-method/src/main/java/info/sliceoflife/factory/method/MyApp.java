/*
 *
 */
package info.sliceoflife.factory.method;

import info.sliceoflife.factory.method.creator.MyBlacksmith;
import info.sliceoflife.factory.method.creator.impl.MyElfBlacksmith;
import info.sliceoflife.factory.method.creator.impl.MyOrcBlacksmith;
import info.sliceoflife.factory.method.product.MyWeapon;
import info.sliceoflife.factory.method.product.impl.MyWeaponType;

/**
 * The Factory Method is a creational design pattern which uses factory methods to deal with the
 * problem of creating objects without specifying the exact class of object that will be created.
 * THis is done by creating object via calling a factory method either specified in an interface
 * and implemented by child classes, or implemented in a base class and optionally overridden by
 * derived clases-rather then by calling a constructor.
 * <p>
 * Factory produces the object of its liking.
 * The weapon {@link MyWeapon} manufactured by the blacksmith depends on the kind of factory
 * implementation it is referring to
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyApp {

  private final MyBlacksmith blacksmith;

  /**
   * Creates an instance of <code>MyApp</code> which will use <code>myBlacksmith</code> to
   * manufacture the weapons for war.
   * <code>MyApp</code> is unaware which concrete implementation of {@link MyBlacksmith} is
   * used. The discision of which blacksmith implementation to use may depend on configuration
   * or the type of rival in war
   *
   * @param blacksmith a not-null implementation of blacksmith
   */
  public MyApp(final MyBlacksmith blacksmith) {
    this.blacksmith = blacksmith;
  }

  /**
   * the program entry point
   *
   * @param args command line args
   */
  public static void main(final String[] args) {
    // Lets go to war with Orc weapons
    MyApp app = new MyApp(new MyOrcBlacksmith());
    app.manufactureWeapons();

    // Lets go to war with Elf weapons
    app = new MyApp(new MyElfBlacksmith());
    app.manufactureWeapons();
  }

  private void manufactureWeapons() {
    MyWeapon weapon;
    weapon = blacksmith.manufactureWeapon(MyWeaponType.SPEAR);
    System.out.println(weapon);
    weapon = blacksmith.manufactureWeapon(MyWeaponType.AXE);
    System.out.println(weapon);
  }

}
