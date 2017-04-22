package info.sliceoflife.templatemethod;

import info.sliceoflife.templatemethod.template.impl.MyHitAndRunMethod;

/**
 * Test MyHitAndRunMethod
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyHitAndRunMethodTest extends MyStealingMethodTest<MyHitAndRunMethod> {

  /**
   * Create a new test for the {@link MyHitAndRunMethod}
   */
  public MyHitAndRunMethodTest() {
    super(
        new MyHitAndRunMethod(),
        "old goblin woman",
        "The target has been chosen as old goblin woman.",
        "Approach the old goblin woman from behind.",
        "Grab the handbag and run away fast!");
  }
}
