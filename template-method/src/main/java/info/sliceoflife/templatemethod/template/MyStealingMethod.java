package info.sliceoflife.templatemethod.template;

/**
 * MyStealingMethod defines skeleton for the algorithm.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public abstract class MyStealingMethod {

  public abstract String pickTarget();

  public abstract void confuseTarget(String target);

  public abstract void stealTheItem(String target);

  /**
   * Steal
   */
  public void steal() {
    final String target = pickTarget();
    System.out.println("The target has been chosen as " + target + ".");
    confuseTarget(target);
    stealTheItem(target);
  }

}
