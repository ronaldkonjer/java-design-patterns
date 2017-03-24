package info.sliceoflife.observer.observer.impl;

import info.sliceoflife.observer.observable.impl.MyGWeather;
import info.sliceoflife.observer.observer.MyRace;
import info.sliceoflife.observer.observer.MyWeatherType;

/**
 * GOrcs
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyGOrcs implements MyRace {

  @Override
  public void update(final MyGWeather weather, final MyWeatherType weatherType) {
    switch (weatherType) {
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
