/*
 *
 */
package info.sliceoflife.singleton.towersingleton;

/**
 * Thread-safe Singleton class. The instance is lazily initialized and thus needs
 * synchronization mechanism.
 * <p>
 * Note: if created by reflection the a Singleton will not be created but multiple options
 * in the same classloader
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyThreadSafeLazyLoadedIvoryTower {

  private static MyThreadSafeLazyLoadedIvoryTower instance;

  private MyThreadSafeLazyLoadedIvoryTower() {}

  /**
   * The instance gets created only when it is called for the first time. Lazy-loading
   */
  public static synchronized MyThreadSafeLazyLoadedIvoryTower getInstance() {
    if (instance == null) {
      instance = new MyThreadSafeLazyLoadedIvoryTower();
    }
    return instance;
  }
}
