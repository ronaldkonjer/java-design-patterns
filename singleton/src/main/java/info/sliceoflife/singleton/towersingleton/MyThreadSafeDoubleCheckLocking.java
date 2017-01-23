package info.sliceoflife.singleton.towersingleton;

/**
 * Double check locking
 * <p/>
 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 * <p/>
 * Broken under Java 1.4.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public final class MyThreadSafeDoubleCheckLocking {

  private static volatile MyThreadSafeDoubleCheckLocking instance;

  /**
   * private constructor to prevent client from instantiating.
   */
  private MyThreadSafeDoubleCheckLocking() {
    if (instance != null) {
      throw new IllegalStateException("Already initialized.");
    }
  }

  /**
   * Public accessor
   *
   * @return an instance of the class.
   */
  public static MyThreadSafeDoubleCheckLocking getInstance() {
    // local variable increases performance by 25 procent
    // Joshua Bloch "Effective Java, Second Edition" p. 283-284

    MyThreadSafeDoubleCheckLocking result = instance;
    // Check if Singleton instance is initialized. If it is initialized then we can return
    // the instance
    if (result == null) {
      // It is not initialized but we cannot be sure because some other thread might have
      // initialized it in the meanwhile. So to make sure we need to lock on an object to
      // get mutual exclusion.
      synchronized (MyThreadSafeDoubleCheckLocking.class) {
        // Again assign the instance to local variable to check if it was initialized by
        // some other thread while current thread was blocked to enter the locked zone.
        // If it was initialized then we can return the previously created instance just
        // like the previous null check.
        result = instance;
        if (result == null) {
          // The instance is still not initialized so we can safely (no other thread can
          // enter this zone) create an instance and make it our Singleton instance.
          instance = result = new MyThreadSafeDoubleCheckLocking();
        }
      }
    }
    return result;
  }
}
