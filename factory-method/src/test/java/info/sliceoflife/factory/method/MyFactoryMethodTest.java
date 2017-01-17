/*
 *
 */
package info.sliceoflife.factory.method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import info.sliceoflife.factory.method.creator.MyBlacksmith;
import info.sliceoflife.factory.method.creator.impl.MyElfBlacksmith;
import info.sliceoflife.factory.method.creator.impl.MyOrcBlacksmith;
import info.sliceoflife.factory.method.product.MyWeapon;
import info.sliceoflife.factory.method.product.impl.MyElfWeapon;
import info.sliceoflife.factory.method.product.impl.MyOrcWeapon;
import info.sliceoflife.factory.method.product.impl.MyWeaponType;

import org.junit.Test;

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
public class MyFactoryMethodTest {

  /**
   * Testing {@link MyOrcBlacksmith} to produce a SPEAR asserting that the Weapon is an
   * instance of {@link MyOrcWeapon}
   */
  @Test
  public void testMyOrcBlacksmithWithSpear() {
    final MyBlacksmith blacksmith = new MyOrcBlacksmith();
    final MyWeapon weapon = blacksmith.manufactureWeapon(MyWeaponType.SPEAR);
    verifyWeapon(weapon, MyWeaponType.SPEAR, MyOrcWeapon.class);
  }

  /**
   * Testing {@link MyOrcBlacksmith} to produce a AXE asserting that the Weapon is an
   * instance of {@link MyOrcWeapon}.
   */
  public void testMyOrcBlacksmithWithAxe() {
    final MyBlacksmith blacksmith = new MyOrcBlacksmith();
    final MyWeapon weapon = blacksmith.manufactureWeapon(MyWeaponType.AXE);
    verifyWeapon(weapon, MyWeaponType.SPEAR, MyOrcWeapon.class);
  }

  /**
   * Testing {@link MyElfBlacksmith} to produce a SHORT_SWORD asserting that the Weapon
   * is an instance of {@link MyElfWeapon}.
   */
  public void testMyElfBlacksmithWithShortSword() {
    final MyBlacksmith blacksmith = new MyElfBlacksmith();
    final MyWeapon weapon = blacksmith.manufactureWeapon(MyWeaponType.SHORT_SWORD);
    verifyWeapon(weapon, MyWeaponType.SHORT_SWORD, MyElfWeapon.class);
  }

  /**
   * Testing {@link MyElfBlacksmith} to produce a SPEAR asserting that the Weapon is
   * an instance of {@link MyElfWeapon}.
   */
  public void testMyElfBlacksmithWithSpear() {
    final MyBlacksmith blacksmith = new MyElfBlacksmith();
    final MyWeapon weapon = blacksmith.manufactureWeapon(MyWeaponType.SPEAR);
    verifyWeapon(weapon, MyWeaponType.SHORT_SWORD, MyElfWeapon.class);
  }

  /**
   * This method asserts that the weapon object that is passed is an instance of the
   * clazz and the weapon is of type expectedWeaponType.
   *
   * @param weapon weapon object which is to be verified
   * @param expectedWeaponType expected WeaponType of the weapon
   * @param clazz expected class of the weapon
   */
  private void verifyWeapon(final MyWeapon weapon, final MyWeaponType expectedWeaponType, final Class<?> clazz) {
    assertTrue("Weapon must be an object of: " + clazz.getName(), clazz.isInstance(weapon));
    assertEquals("Weapon must be of weaponType: " + clazz.getName(), expectedWeaponType, weapon.getWeaponType());
  }
}
