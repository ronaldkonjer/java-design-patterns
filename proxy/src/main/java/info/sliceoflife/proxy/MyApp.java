/*
 *
 */
package info.sliceoflife.proxy;

import info.sliceoflife.proxy.pojo.MyWizard;
import info.sliceoflife.proxy.pojo.MyWizardTower;
import info.sliceoflife.proxy.proxy.MyWizardTowerProxy;

/**
 * A proxy, in its most general form, is a class functioning as an interface to something else.
 * The proxy could interface to anything; a network connection, a large object in memory, a file,
 * or some other resource that is expensive or impossible to duplicate. In short, a proxy is a
 * wrapper or agent object that is being called by the client to access the real serving object
 * behind the scenes.
 * <p>
 * The Proxy design pattern allows you to provide an interface to other objects by creating a
 * wrapper class as the proxy. The wrapper class, which is the proxy, can add additional
 * functionality to the object of interest without changing the object's code.
 * <p>
 * In this example the proxy ({@link MyWizardTowerProxy}) controls access to the actual object
 * ({@link MyWizardTower})
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyApp {

  /**
   * Program entry point
   */
  public static void main(final String[] args) {
    final MyWizardTowerProxy tower = new MyWizardTowerProxy();
    tower.enter(new MyWizard("Red wizard"));
    tower.enter(new MyWizard("White wizard"));
    tower.enter(new MyWizard("Black wizard"));
    tower.enter(new MyWizard("Green wizard"));
    tower.enter(new MyWizard("Brown wizard"));

  }

}
