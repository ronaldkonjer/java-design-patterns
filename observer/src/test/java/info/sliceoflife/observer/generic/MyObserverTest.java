package info.sliceoflife.observer.generic;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import info.sliceoflife.observer.MyStdOutTest;
import info.sliceoflife.observer.observer.MyObserver;
import info.sliceoflife.observer.observer.MyWeatherType;

import java.util.function.Supplier;

import org.junit.Test;

/**
 * MyObserver test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyObserverTest<O extends MyObserver> extends MyStdOutTest {

  /**
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
  MyObserverTest(final MyWeatherType weather, final String response, final Supplier<O> factory) {
    this.weather = weather;
    this.response = response;
    this.factory = factory;
  }

  /**
   * Verify if the weather has the expected influence on the observer
   */
  @Test
  public void testObserver() {
    final O observer = this.factory.get();
    verifyZeroInteractions(getStdOutMock());

    observer.update(null, this.weather);
    verify(getStdOutMock()).println(this.response);
    verifyNoMoreInteractions(getStdOutMock());

  }

}
