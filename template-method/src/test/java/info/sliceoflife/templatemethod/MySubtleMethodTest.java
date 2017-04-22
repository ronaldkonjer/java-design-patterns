package info.sliceoflife.templatemethod;

import info.sliceoflife.templatemethod.template.impl.MySubtleMethod;

/**
 * Test MySubtleMethod
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySubtleMethodTest extends MyStealingMethodTest<MySubtleMethod> {

  /**
   * Create a new test for the {@link MySubtleMethod}
   */
  public MySubtleMethodTest() {
    super(
        new MySubtleMethod(),
        "shop keeper",
        "The target has been chosen as shop keeper.",
        "Approach the shop keeper with tears running and hug him!",
        "While in close contact grab the shop keeper's wallet.");
  }

}
