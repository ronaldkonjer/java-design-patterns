package info.sliceoflife.observer;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import info.sliceoflife.observer.observable.impl.MyWeather;
import info.sliceoflife.observer.observer.MyWeatherObserver;
import info.sliceoflife.observer.observer.MyWeatherType;

import org.junit.Test;
import org.mockito.InOrder;

/**
 * MyWeather test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyWeatherTest extends MyStdOutTest {

  /**
   * Add a {@link MyWeatherObserver}, verify if it gets notified of a weather change, remove the
   * observer again and verify that there are no more notifications.
   */
  @Test
  public void testAddRemoveObserver() {
    final MyWeatherObserver observer = mock(MyWeatherObserver.class);

    final MyWeather weather = new MyWeather();
    weather.addObserver(observer);
    verifyZeroInteractions(observer);

    weather.timePasses();
    verify(getStdOutMock()).println("The weather changed to rainy.");
    verify(observer).update(MyWeatherType.RAINY);

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
    final MyWeatherObserver observer = mock(MyWeatherObserver.class);
    final MyWeather weather = new MyWeather();
    weather.addObserver(observer);

    final InOrder inOrder = inOrder(observer, getStdOutMock());
    final MyWeatherType[] weatherTypes = MyWeatherType.values();
    for (int i = 1; i < 20; i++) {
      weather.timePasses();
      inOrder.verify(observer).update(weatherTypes[i % weatherTypes.length]);
    }

    verifyNoMoreInteractions(observer);
  }

}
