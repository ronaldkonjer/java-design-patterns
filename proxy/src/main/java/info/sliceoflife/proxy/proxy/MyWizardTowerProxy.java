package info.sliceoflife.proxy.proxy;

import info.sliceoflife.proxy.pojo.MyWizard;
import info.sliceoflife.proxy.pojo.MyWizardTower;

/**
 * The proxy controlling acces to the {@link MyWizardTower}
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyWizardTowerProxy extends MyWizardTower {

  private static final int NUM_WIZARDS_ALLOWED = 3;

  private int numWizards;

  @Override
  public void enter(final MyWizard wizard) {
    if (numWizards < NUM_WIZARDS_ALLOWED) {
      super.enter(wizard);
      numWizards++;
    } else {
      System.out.println(wizard + " is not allowed to enter!");
    }
  }

}
