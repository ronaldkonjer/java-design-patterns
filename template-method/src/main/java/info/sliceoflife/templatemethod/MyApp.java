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
package info.sliceoflife.templatemethod;

import info.sliceoflife.templatemethod.client.MyHalflingThief;
import info.sliceoflife.templatemethod.template.MyStealingMethod;
import info.sliceoflife.templatemethod.template.impl.MyHitAndRunMethod;
import info.sliceoflife.templatemethod.template.impl.MySubtleMethod;

/**
 * Template Method defines a skeleton for an algorithm. The algorithm subclasses provide
 * implementation for the blank parts.
 * <p>
 * In this example {@link MyHalflingThief} contains {@link MyStealingMethod} that can be changed.
 * First the thief hits with {@link MyHitAndRunMethod} and then with {@link MySubtleMethod}
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * The program entry point
   * 
   * @param args command line args
   */
  public static void main(final String[] args) {
    final MyHalflingThief thief = new MyHalflingThief(new MyHitAndRunMethod());
    thief.steal();
    thief.changeMethod(new MySubtleMethod());
    thief.steal();
  }

}
