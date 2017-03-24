package info.sliceoflife.observer.observable.impl;

import info.sliceoflife.observer.observer.MyWeatherObserver;
import info.sliceoflife.observer.observer.MyWeatherType;

import java.util.ArrayList;
import java.util.List;

/**
 * MyWeather can be observed by implementing {@link MyWeatherObserver} interface and registering as
 * listener.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyWeather {

  public MyWeatherType currentWeather;
  private final List<MyWeatherObserver> observers;

  public MyWeather() {
    observers = new ArrayList<>();
    currentWeather = MyWeatherType.SUNNY;
  }

  public void addObserver(final MyWeatherObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(final MyWeatherObserver observer) {
    observers.remove(observer);
  }

  public void timePasses() {
    final MyWeatherType[] enumValues = MyWeatherType.values();
    currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
    System.out.println("The weather changed to " + currentWeather + ".");
    notifyObservers();
  }

  public void notifyObservers() {
    for (final MyWeatherObserver observer : observers) {
      observer.update(currentWeather);
    }
  }

}
