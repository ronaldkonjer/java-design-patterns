package info.sliceoflife.observer.generic;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import info.sliceoflife.observer.observable.impl.MyGWeather;
import info.sliceoflife.observer.observer.MyRace;
import info.sliceoflife.observer.observer.MyWeatherObserver;
import info.sliceoflife.observer.observer.MyWeatherType;

import org.junit.Test;

import com.iluwatar.observer.StdOutTest;

/**
 * MyGWeather test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyGWeatherTest extends StdOutTest {

  /**
   * Add a {@link MyWeatherObserver}, verify if it gets notified of a weather change, remove the
   * observer again and verify that there are no more notifications.
   */
  @Test
  public void testAddRemoveObserver() {
    final MyRace observer = mock(MyRace.class);

    final MyGWeather weather = new MyGWeather();
    weather.addObserver(observer);
    verifyZeroInteractions(observer);

    weather.timePasses();
    verify(getStdOutMock()).println("The weather changed to rainy.");
    // verify(observer).update(weather, MyWeatherType.RAINY);

    weather.removeObserver(observer);
    weather.timePasses();
    verify(getStdOutMock()).println("The weather changed to windy.");

    verifyNoMoreInteractions(observer, getStdOutMock());
  }

  /**
   * Verify if the weather passes in the order of the {@link MyWeatherType}
   */
  @Test
  public void testTimePasses() {
    final MyRace observer = mock(MyRace.class);
    final MyGWeather weather = new MyGWeather();
    weather.addObserver(observer);
  }

}
