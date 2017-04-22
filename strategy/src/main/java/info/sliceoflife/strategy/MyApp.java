/*
 *
 */
package info.sliceoflife.strategy;

import info.sliceoflife.strategy.context.MyDragonSlayer;
import info.sliceoflife.strategy.strategy.MyDragonSlayingStrategy;
import info.sliceoflife.strategy.strategy.impl.MyMeleeStrategy;
import info.sliceoflife.strategy.strategy.impl.MyProjectileStrategy;
import info.sliceoflife.strategy.strategy.impl.MySpellStrategy;

/**
 * The Strategy Pattern (also known as the policy pattern) is a software design pattern that enables
 * an algorithm's behavior to be selected at runtime.
 * <p>
 * Before java 8 the Strategies needed to be separate classes forcing the developer
 * to write lots of boilerplate code. With modern Java it is easy to pass behavior
 * with method references and lambdas making code shorter and more readable.
 * <p>
 * In this example ({@link MyDragonSlayingStrategy}) encapsulates an algorithm. The containing
 * object
 * ({@link MyDragonSlayer}) can alter its behavior by changing its strategy.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyApp {

  /**
   * Programs entry point
   *
   * @param args command line args
   */
  public static void main(final String[] args) {
    // GoF Strategy pattern
    System.out.println("Green dragon spotted ahead!");
    MyDragonSlayer dragonSlayer = new MyDragonSlayer(new MyMeleeStrategy());
    dragonSlayer.goToBattle();
    System.out.println("Red dragon emerges.");
    dragonSlayer.changeStrategy(new MyProjectileStrategy());
    dragonSlayer.goToBattle();
    System.out.println("Black dragon lands before you.");
    dragonSlayer.changeStrategy(new MySpellStrategy());
    dragonSlayer.goToBattle();

    // Java 8 Strategy Pattern
    System.out.println("Green dragon spotted ahead!");
    dragonSlayer = new MyDragonSlayer(
        () -> System.out.println("With your Excalibur you sever the dragon's head!"));
    dragonSlayer.goToBattle();
    System.out.println("Red dragon emerges.");
    dragonSlayer.changeStrategy(() -> System.out.println(
        "You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
    dragonSlayer.goToBattle();
    System.out.println("Black dragon lands before you.");
    dragonSlayer.changeStrategy(() -> System.out.println(
        "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
    dragonSlayer.goToBattle();
  }

}
