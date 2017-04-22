package info.sliceoflife.templatemethod.client;

import info.sliceoflife.templatemethod.template.MyStealingMethod;

/**
 * MyHalfling thief uses {@link MyStealingMethod} to steal
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyHalflingThief {

  private MyStealingMethod method;

  public MyHalflingThief(final MyStealingMethod method) {
    this.method = method;
  }

  public void steal() {
    method.steal();
  }

  public void changeMethod(final MyStealingMethod method) {
    this.method = method;
  }

}
