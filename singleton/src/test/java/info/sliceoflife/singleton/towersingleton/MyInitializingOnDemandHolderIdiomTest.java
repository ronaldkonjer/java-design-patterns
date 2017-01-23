package info.sliceoflife.singleton.towersingleton;

/**
 * Create a new Singleton test instance using th given 'getInstance' method
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyInitializingOnDemandHolderIdiomTest extends MySingletonTest<MyInitializingOnDemandHolderIdiom> {

  public MyInitializingOnDemandHolderIdiomTest() {
    super(MyInitializingOnDemandHolderIdiom::getInstance);
  }

}
