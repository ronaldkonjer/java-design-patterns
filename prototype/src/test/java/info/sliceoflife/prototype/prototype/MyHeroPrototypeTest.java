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
package info.sliceoflife.prototype.prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import info.sliceoflife.prototype.heroprototype.MyPrototype;
import info.sliceoflife.prototype.heroprototype.impl.MyElfBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyElfMage;
import info.sliceoflife.prototype.heroprototype.impl.MyElfWarlord;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcMage;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcWarlord;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.iluwatar.prototype.Prototype;

/**
 * Prototype test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
@RunWith(Parameterized.class)
public class MyHeroPrototypeTest<P extends Prototype> {

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
        new Object[] {new MyOrcBeast(), "Orcish wolf"},
        new Object[] {new MyOrcMage(), "Orcish mage"},
        new Object[] {new MyOrcWarlord(), "Orcish warlord"},
        new Object[] {new MyElfBeast(), "Elven eagle"},
        new Object[] {new MyElfMage(), "Elven mage"},
        new Object[] {new MyElfWarlord(), "Elven warlord"});
  }

  /**
   * The tested prototype instance
   */
  private final MyPrototype testedPrototype;

  /**
   * The expected {@link MyPrototype#toString()} value
   */
  private final String expectedToString;

  /**
   * Create a new test instance, using the given test object and expected value
   *
   * @param testedPrototype The tested Prototype
   * @param expectedToString The expected {@link MyPrototype#toString()} value
   */
  public MyHeroPrototypeTest(final MyPrototype testedPrototype, final String expectedToString) {
    this.expectedToString = expectedToString;
    this.testedPrototype = testedPrototype;
  }

  @Test
  public void testMyProtoType() throws Exception {
    assertEquals(this.expectedToString, this.testedPrototype.toString());

    final Object clone = this.testedPrototype.clone();
    assertNotNull(clone);
    assertNotSame(clone, this.testedPrototype);
    assertSame(this.testedPrototype.getClass(), clone.getClass());
  }

}
