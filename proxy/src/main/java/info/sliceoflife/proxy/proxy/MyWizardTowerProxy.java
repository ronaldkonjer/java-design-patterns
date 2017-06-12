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
package info.sliceoflife.proxy.proxy;

import info.sliceoflife.proxy.pojo.MyWizard;
import info.sliceoflife.proxy.pojo.MyWizardTower;

/**
 * The proxy controlling acces to the {@link MyWizardTower}
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyWizardTowerProxy extends MyWizardTower {

  private static final int NUM_WIZARDS_ALLOWED = 3;

  private int numWizards;

  @Override
  public void enter(final MyWizard wizard) {
    if (numWizards < NUM_WIZARDS_ALLOWED) {
      super.enter(wizard);
      numWizards++;
    } else {
      System.out.println(wizard + " is not allowed to enter!");
    }
  }

}
