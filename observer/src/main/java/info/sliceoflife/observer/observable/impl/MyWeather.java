/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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

  /**
   * Makes time pass
   */
  public void timePasses() {
    final MyWeatherType[] enumValues = MyWeatherType.values();
    currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
    System.out.println("The weather changed to " + currentWeather + ".");
    notifyObservers();
  }

  /**
   * Send notification to the registered observers.
   */
  public void notifyObservers() {
    for (final MyWeatherObserver observer : observers) {
      observer.update(currentWeather);
    }
  }

}
