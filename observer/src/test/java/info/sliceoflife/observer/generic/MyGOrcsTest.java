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
package info.sliceoflife.observer.generic;

import info.sliceoflife.observer.observer.MyWeatherType;
import info.sliceoflife.observer.observer.impl.MyGOrcs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * MyGOrcs test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
@RunWith(Parameterized.class)
public class MyGOrcsTest extends MyObserverTest<MyGOrcs> {

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    final List<Object[]> testData = new ArrayList<>();
    testData.add(new Object[] {MyWeatherType.SUNNY, "The sun hurts the orcs' eyes."});
    testData.add(new Object[] {MyWeatherType.RAINY, "The orcs are dripping wet."});
    testData.add(new Object[] {MyWeatherType.WINDY, "The orcs smell almost vanishes in the wind."});
    testData.add(new Object[] {MyWeatherType.COLD, "The orcs are freezing cold."});
    return testData;
  }

  /**
   * Create a new test with the given weather and expected response
   *
   * @param weather The weather that should be unleashed on the observer
   * @param response The expected response from the observer
   */
  public MyGOrcsTest(final MyWeatherType weather, final String response) {
    super(weather, response, MyGOrcs::new);
  }

}
