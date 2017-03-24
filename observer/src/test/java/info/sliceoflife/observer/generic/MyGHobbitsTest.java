package info.sliceoflife.observer.generic;

import info.sliceoflife.observer.observer.MyWeatherType;
import info.sliceoflife.observer.observer.impl.MyGHobbits;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * MyGHobbits test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
@RunWith(Parameterized.class)
public class MyGHobbitsTest extends MyObserverTest<MyGHobbits> {

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    final List<Object[]> testData = new ArrayList<>();
    testData.add(new Object[] {MyWeatherType.SUNNY, "The happy hobbits bade in the warm sun."});
    testData.add(new Object[] {MyWeatherType.RAINY, "The hobbits look for cover from the rain."});
    testData.add(new Object[] {MyWeatherType.WINDY, "The hobbits hold their hats tightly in the windy weather."});
    testData.add(new Object[] {MyWeatherType.COLD, "The hobbits are shivering in the cold weather."});
    return testData;
  }

  /**
   * Create a new test with the given weather and expected response
   *
   * @param weather The weather that should be unleashed on the observer
   * @param response The expected response from the observer
   */
  public MyGHobbitsTest(final MyWeatherType weather, final String response) {
    super(weather, response, MyGHobbits::new);
  }

}
