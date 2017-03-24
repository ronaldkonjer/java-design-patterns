package info.sliceoflife.observer.observer;

/**
 * MyWeatherType enumeration
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public enum MyWeatherType {
  SUNNY, RAINY, WINDY, COLD;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
