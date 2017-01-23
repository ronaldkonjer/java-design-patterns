package info.sliceoflife.singleton.towersingleton;

/**
 * Create a new Singleton test instance using the given 'getInstance' method
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyThreadSafeDoubleCheckLockingTest extends MySingletonTest<MyThreadSafeDoubleCheckLocking> {

  public MyThreadSafeDoubleCheckLockingTest() {
    super(MyThreadSafeDoubleCheckLocking::getInstance);
  }

}
