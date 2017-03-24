package info.sliceoflife.observer;

import info.sliceoflife.observer.observable.impl.MyGWeather;
import info.sliceoflife.observer.observable.impl.MyWeather;
import info.sliceoflife.observer.observer.impl.MyGHobbits;
import info.sliceoflife.observer.observer.impl.MyGOrcs;
import info.sliceoflife.observer.observer.impl.MyHobbits;
import info.sliceoflife.observer.observer.impl.MyOrcs;

/**
 * The Observer Pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any
 * state changes, usually by calling one of their methods. It is mainly used to implement
 * distributed event handling systems. The Observer pattern is also a key part in the familiar'
 * Model-View-Controller architectural pattern. The Observer pattern is implemented in numerous
 * programming libraries and systems, including almost all GUI toolkits.
 * <p>
 * In this example {@link MyWeather} has a state that can be observed. The {@link MyOrcs} and
 * {@link MyHobbits} register as observers and receive notifications when the {@link MyWeather}
 * changes.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(final String[] args) {
    final MyWeather weather = new MyWeather();
    weather.addObserver(new MyOrcs());
    weather.addObserver(new MyHobbits());

    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
    weather.timePasses();

    // Generic observer inspired by Java Generics and Collections
    System.out.println("\n--Running generic version--");
    final MyGWeather gWeather = new MyGWeather();
    gWeather.addObserver(new MyGOrcs());
    gWeather.addObserver(new MyGHobbits());

    gWeather.timePasses();
    gWeather.timePasses();
    gWeather.timePasses();
    gWeather.timePasses();

  }

}
