package info.sliceoflife.singleton.towersingleton;

/**
 * Create a new Singleton test instance using the given 'getInstance' method
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyIvoryTowerTest extends MySingletonTest<MyIvoryTower> {

  public MyIvoryTowerTest() {
    super(MyIvoryTower::getInstance);
  }

}
