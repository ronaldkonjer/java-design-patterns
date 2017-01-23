package info.sliceoflife.singleton.towersingleton;

/**
 * Create a new Singleton test isntance using the given 'getInstance' method
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyThreadSafeLazyLoadedIvoryTowerTest extends MySingletonTest<MyThreadSafeLazyLoadedIvoryTower> {

  public MyThreadSafeLazyLoadedIvoryTowerTest() {
    super(MyThreadSafeLazyLoadedIvoryTower::getInstance);
  }

}
