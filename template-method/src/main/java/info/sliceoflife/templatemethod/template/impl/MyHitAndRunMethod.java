package info.sliceoflife.templatemethod.template.impl;

import info.sliceoflife.templatemethod.template.MyStealingMethod;

/**
 * MyHitAndRunMethod implementation of {@link MyStealingMethod}
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyHitAndRunMethod extends MyStealingMethod {

  @Override
  public String pickTarget() {
    return "old goblin woman";
  }

  @Override
  public void confuseTarget(final String target) {
    System.out.println("Approach the " + target + " from behind.");
  }

  @Override
  public void stealTheItem(final String target) {
    System.out.println("Grab the handbag and run away fast!");
  }

}
