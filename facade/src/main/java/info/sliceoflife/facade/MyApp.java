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
package info.sliceoflife.facade;

import info.sliceoflife.facade.dwarvengoldmine.facade.MyDwarvenGoldmineFacade;

/**
 * The Facade design pattern is often used when a system is very complex or difficult to
 * understand because the system has a large number of interdependent classes or its
 * source code is unavailable. This Pattern hides the complexities of the larger system and
 * provides a single interface to the client. It typically involves a single wrapper class
 * which contains a set of members required by the client. These members access the system
 * on behalf of the Facade client and hide the implementation details.
 * <p>
 * In this example the Facade is ({@link MyDwarvenGoldmineFacade}) and it provides a simpler
 * interface tp the goldmine sybsystem.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * Program entry point
   *
   * @param args command line args
   */

  public static void main(final String[] args) {
    final MyDwarvenGoldmineFacade facade = new MyDwarvenGoldmineFacade();
    facade.startNewDay();
    facade.digOutGold();
    facade.endDay();
  }

}
