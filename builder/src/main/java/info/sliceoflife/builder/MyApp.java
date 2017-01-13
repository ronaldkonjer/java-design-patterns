package info.sliceoflife.builder;

import info.sliceoflife.builder.herobuilder.Builder;
import info.sliceoflife.builder.herobuilder.Hero;
import info.sliceoflife.builder.herobuilder.impl.Armor;
import info.sliceoflife.builder.herobuilder.impl.HairColor;
import info.sliceoflife.builder.herobuilder.impl.HairType;
import info.sliceoflife.builder.herobuilder.impl.Profession;
import info.sliceoflife.builder.herobuilder.impl.Weapon;

/**
 * The intention of the builder pattern is to find a solution to the telescoping constructor
 * anti-pattern. The telescoping constructor anti-pattern occurs when the increase of object
 * constructor parameter combination leads to an exponential list of constructors. Instead of using
 * numerous constructors, the builder pattern uses another object, a builder, that receives each
 * initialization parameter step by step and then returns the resulting constructed object at once.
 * <p>
 * The builder pattern has another benefit. It can be used for objects that contain flat data (html
 * code, sql query, X.509 certificate...), that is to say, data that can't be easily edited. This
 * type of data cannot be edited step by step and must be edited at once. The best way to construct
 * such an object is to use a builder class.
 * <p>
 * In this example we have the Builder pattern variation as described by Joshua Bloch in Effective
 * Java 2nd edition
 * <p>
 * We want to build {@link Hero} objects, but its construction is complex because of the many
 * parameters needed. To aid the user we introduce {@link Builder} class. {@link Hero.Builder}
 * takes the minimum parameters to build {@link Hero} object in its constructor. After that
 * additional configuration for the {@link Hero} object can be done using the fluent
 * {@link Builder} interface. When configuration is ready the build method is called to receive
 * the final {@link Hero} object.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * Program enty point
   *
   * @param args command line args
   */

  public static void main(final String[] args) {
    final Hero mage =
        new Builder(Profession.MAGE, "Riobard").withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER).build();
    System.out.println(mage);

    final Hero warrior = new Builder(Profession.WARRIOR, "Amberjill").withHairColor(HairColor.BLOND)
      .withHairType(HairType.LONG_CURLY)
      .withArmor(Armor.CHAIN_MAIL)
      .withWeapon(Weapon.SWORD)
      .build();
    System.out.println(warrior);

    final Hero thief =
        new Builder(Profession.WARRIOR, "Desmond").withHairType(HairType.BALD).withWeapon(Weapon.BOW).build();
    System.out.println(thief);

  }

}
