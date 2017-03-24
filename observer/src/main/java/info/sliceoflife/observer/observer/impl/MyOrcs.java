package info.sliceoflife.observer.observer.impl;

import info.sliceoflife.observer.observer.MyWeatherObserver;
import info.sliceoflife.observer.observer.MyWeatherType;

/**
 * MyOrcs
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyOrcs implements MyWeatherObserver {

  @Override
  public void update(final MyWeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        System.out.println("The orcs are freezing cold.");
        break;
      case RAINY:
        System.out.println("The orcs are dripping wet.");
        break;
      case SUNNY:
        System.out.println("The sun hurts the orcs' eyes.");
        break;
      case WINDY:
        System.out.println("The orcs smell almost vanishes in the wind.");
        break;
      default:
        break;
    }
  }
}
