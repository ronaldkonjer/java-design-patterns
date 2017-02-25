package info.sliceoflife.decorator;

import info.sliceoflife.decorator.component.MyHostile;
import info.sliceoflife.decorator.component.impl.MyTroll;
import info.sliceoflife.decorator.decorator.MySmartHostile;

/**
 * The Decorator Pattern is a more flexible alternative to subclassing. The Decorator class
 * implements the same interface as the target and uses compostion to "decorate" calls to the
 * target. Using the Decorator Pattern it is possible to change the behavior of the class during
 * runtime.
 * <p>
 * In this example we show how the simple {@link MyTroll} first attacks and then flees the battle.
 * Then we decorate the {@link MyTroll} with a {@link MySmartHostile} and perform the attack again.
 * You can see how the behavior changes after the decoration.
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

    // Simple troll
    System.out.println("A simple looking troll approaches.");
    final MyHostile troll = new MyTroll();
    troll.attack();
    troll.fleeBattle();
    System.out.printf("Simple troll power %d. \n", troll.getAttackPower());

    // Change the behavior of the simple troll by adding a decorator
    System.out.println("\nA smart looking troll surprises you.");
    final MyHostile smart = new MySmartHostile(troll);
    smart.attack();
    smart.fleeBattle();
    System.out.printf("Smart troll power %d \n", smart.getAttackPower());
  }

}
