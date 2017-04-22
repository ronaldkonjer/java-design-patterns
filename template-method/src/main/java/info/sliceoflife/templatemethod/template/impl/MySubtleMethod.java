package info.sliceoflife.templatemethod.template.impl;

import info.sliceoflife.templatemethod.template.MyStealingMethod;

/**
 * SubtleMethod implementation of {@link MyStealingMethod}
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySubtleMethod extends MyStealingMethod {

  @Override
  public String pickTarget() {
    return "shop keeper";
  }

  @Override
  public void confuseTarget(final String target) {
    System.out.println("Approach the " + target + " with tears running and hug him!");
  }

  @Override
  public void stealTheItem(final String target) {
    System.out.println("While in close contact grab the " + target + "'s wallet.");
  }

}
