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
package info.sliceoflife.prototype.herofactory.impl;

import info.sliceoflife.prototype.herofactory.MyHeroFactory;
import info.sliceoflife.prototype.heroprototype.impl.MyBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyMage;
import info.sliceoflife.prototype.heroprototype.impl.MyWarlord;

/**
 * Concrete factory class.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyHeroFactoryImpl implements MyHeroFactory {

  private final MyMage mage;
  private final MyWarlord warlord;
  private final MyBeast beast;

  /**
   * Constructor
   *
   * @param mage the mage class
   * @param warlord the warlord class
   * @param beast the beast class
   */
  public MyHeroFactoryImpl(final MyMage mage, final MyWarlord warlord, final MyBeast beast) {
    this.mage = mage;
    this.warlord = warlord;
    this.beast = beast;
  }

  /**
   * Create MyMage
   */

  @Override
  public MyMage createMage() {
    try {
      return mage.clone();
    } catch (final CloneNotSupportedException e) {
      return null;
    }
  }

  /**
   * create MyWarlord
   */

  @Override
  public MyWarlord createWarlord() {
    try {
      return warlord.clone();
    } catch (final CloneNotSupportedException e) {
      return null;
    }

  }

  /**
   * create Beast
   */
  @Override
  public MyBeast createBeast() {
    try {
      return beast.clone();
    } catch (final CloneNotSupportedException e) {
      return null;
    }
  }

}
