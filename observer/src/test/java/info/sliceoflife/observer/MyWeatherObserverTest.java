package info.sliceoflife.observer;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import info.sliceoflife.observer.observer.MyWeatherObserver;
import info.sliceoflife.observer.observer.MyWeatherType;

import java.util.function.Supplier;

import org.junit.Test;

/**
 * MyWeatherObserver test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public abstract class MyWeatherObserverTest<O extends MyWeatherObserver> extends MyStdOutTest {

  /*
   * The observer instance factory
   */
  private final Supplier<O> factory;

  /**
   * The weather type currently tested
   */
  private final MyWeatherType weather;

  /**
   * The expected response from the observer
   */
  private final String response;

  /**
   * Create a new test instance using the given parameters
   *
   * @param weather The weather currently being tested
   * @param response The expected response from the observer
   * @param factory The factory, used to create an instance of the tested observer
   */
  MyWeatherObserverTest(final MyWeatherType weather, final String response, final Supplier<O> factory) {
    this.weather = weather;
    this.response = response;
    this.factory = factory;
  }

  @Test
  public void testObserver() {
    final O observer = this.factory.get();
    verifyZeroInteractions(getStdOutMock());

    observer.update(this.weather);
    verify(getStdOutMock()).println(this.response);
    verifyNoMoreInteractions(getStdOutMock());
  }

}
