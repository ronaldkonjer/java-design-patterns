package info.sliceoflife.observer.observable.impl;

import info.sliceoflife.observer.observable.MyObservable;
import info.sliceoflife.observer.observer.MyRace;
import info.sliceoflife.observer.observer.MyWeatherType;

/**
 * MyGWeather
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyGWeather extends MyObservable<MyGWeather, MyRace, MyWeatherType> {

  private MyWeatherType currentWeather;

  public MyGWeather() {
    currentWeather = MyWeatherType.SUNNY;
  }

  /**
   * Makes time pass for weather
   */
  public void timePasses() {
    final MyWeatherType[] enumValues = MyWeatherType.values();
    currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
    System.out.println("The weather changed to " + currentWeather + ".");
  }

}
