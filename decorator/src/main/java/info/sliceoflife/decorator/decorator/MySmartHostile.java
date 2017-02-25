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
package info.sliceoflife.decorator.decorator;

import info.sliceoflife.decorator.component.MyHostile;

import com.iluwatar.decorator.Hostile;

/**
 * SmartHostile is a decorator for {@link Hostile} objects. The call to the {@link Hostile}
 * interface are intercepted and decorated. Finally the calls are delegated to the decorated
 * {@link Hostile} object.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MySmartHostile implements MyHostile {

  // Each decorator HAS-A(WRAPS) component
  private final MyHostile decorated;

  public MySmartHostile(final MyHostile decorated) {
    this.decorated = decorated;
  }

  @Override
  public void attack() {
    System.out.println("It throws a rock at you!");
    decorated.attack();
  }

  @Override
  public int getAttackPower() {
    return decorated.getAttackPower() + 20;
  }

  @Override
  public void fleeBattle() {
    System.out.println("It calls for help!");
    decorated.fleeBattle();
  }

}
