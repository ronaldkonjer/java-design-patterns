package info.sliceoflife.singleton.towersingleton;

public class MyEnumIvoryTowerTest extends MySingletonTest<MyEnumIvoryTower> {

  /**
   * Create a new Singleton test instance using the given 'getInstance' method
   */

  public MyEnumIvoryTowerTest() {
    super(() -> MyEnumIvoryTower.INSTANCE);
  }

}
