package info.sliceoflife.templatemethod;

import info.sliceoflife.templatemethod.client.MyHalflingThief;
import info.sliceoflife.templatemethod.template.MyStealingMethod;
import info.sliceoflife.templatemethod.template.impl.MyHitAndRunMethod;
import info.sliceoflife.templatemethod.template.impl.MySubtleMethod;

/**
 * Template Method defines a skeleton for an algorithm. The algorithm subclasses provide
 * implementation for the blank parts.
 * <p>
 * In this example {@link MyHalflingThief} contains {@link MyStealingMethod} that can be changed.
 * First the thief hits with {@link MyHitAndRunMethod} and then with {@link MySubtleMethod}
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * The program entry point
   * 
   * @param args command line args
   */
  public static void main(final String[] args) {
    final MyHalflingThief thief = new MyHalflingThief(new MyHitAndRunMethod());
    thief.steal();
    thief.changeMethod(new MySubtleMethod());
    thief.steal();
  }

}
