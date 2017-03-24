package info.sliceoflife.observer.generic;

import info.sliceoflife.observer.observer.MyWeatherType;
import info.sliceoflife.observer.observer.impl.MyGOrcs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * MyGOrcs test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
@RunWith(Parameterized.class)
public class MyGOrcsTest extends MyObserverTest<MyGOrcs> {

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    final List<Object[]> testData = new ArrayList<>();
    testData.add(new Object[] {MyWeatherType.SUNNY, "The sun hurts the orcs' eyes."});
    testData.add(new Object[] {MyWeatherType.RAINY, "The orcs are dripping wet."});
    testData.add(new Object[] {MyWeatherType.WINDY, "The orcs smell almost vanishes in the wind."});
    testData.add(new Object[] {MyWeatherType.COLD, "The orcs are freezing cold."});
    return testData;
  }

  /**
   * Create a new test with the given weather and expected response
   *
   * @param weather The weather that should be unleashed on the observer
   * @param response The expected response from the observer
   */
  public MyGOrcsTest(final MyWeatherType weather, final String response) {
    super(weather, response, MyGOrcs::new);
  }

}
