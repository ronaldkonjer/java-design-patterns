package info.sliceoflife.singleton.towersingleton;

/**
 * Singleton class. Eagerly initialized static instance guarantees thread safety
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public final class MyIvoryTower {

  /**
   * Static to class instance of the class.
   */
  private static final MyIvoryTower INSTANCE = new MyIvoryTower();

  /**
   * private constructor so nobody can instantiate the class.
   */
  private MyIvoryTower() {}

  /**
   * To be called by client to obtain instance of the class.
   *
   * @return instance of the Singleton.
   */
  public static MyIvoryTower getInstance() {
    return INSTANCE;
  }
}
