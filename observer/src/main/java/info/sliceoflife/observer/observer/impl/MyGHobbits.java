package info.sliceoflife.observer.observer.impl;

import info.sliceoflife.observer.observable.impl.MyGWeather;
import info.sliceoflife.observer.observer.MyRace;
import info.sliceoflife.observer.observer.MyWeatherType;

/**
 * MyGHobbits
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyGHobbits implements MyRace {

  @Override
  public void update(final MyGWeather weather, final MyWeatherType weatherType) {
    switch (weatherType) {
      case COLD:
        System.out.println("The hobbits are shivering in the cold weather.");
        break;
      case RAINY:
        System.out.println("The hobbits look for cover from the rain.");
        break;
      case SUNNY:
        System.out.println("The happy hobbits bade in the warm sun.");
        break;
      case WINDY:
        System.out.println("The hobbits hold their hats tightly in the windy weather.");
        break;
      default:
        break;
    }
  }
}
