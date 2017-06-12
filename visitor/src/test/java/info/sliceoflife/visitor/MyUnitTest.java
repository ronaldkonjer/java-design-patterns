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
package info.sliceoflife.visitor;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.sliceoflife.visitor.composite.MyUnit;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

import java.util.Arrays;
import java.util.function.Function;

import org.junit.Test;

/**
 * Abstract test for the units
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyUnitTest<U extends MyUnit> {

  /**
   * Factory to create new instances of the tested unit
   */
  private final Function<MyUnit[], U> factory;

  /**
   * Create a new test instance for the given unit type {@link U}
   *
   * @param factory Factory to create new instances of the tested unit
   */
  public MyUnitTest(final Function<MyUnit[], U> factory) {
    this.factory = factory;
  }

  @Test
  public void testAccept() throws Exception {
    final MyUnit[] children = new MyUnit[5];
    Arrays.setAll(children, (i) -> mock(MyUnit.class));

    final U unit = this.factory.apply(children);
    final MyUnitVisitor visitor = mock(MyUnitVisitor.class);
    unit.accept(visitor);
    verifyVisit(unit, visitor);

    for (final MyUnit child : children) {
      verify(child).accept(eq(visitor));
    }

    verifyNoMoreInteractions(children);
    verifyNoMoreInteractions(visitor);

  }

  /**
   * Verify if the correct visit method is called on the mock, depending on the tested instance
   *
   * @param unit The tested unit instance
   * @param mockedVisitor The mocked {@link MyUnitVisitor} who should have gotten a visit by the
   *        unit
   */
  abstract void verifyVisit(U unit, MyUnitVisitor mockedVisitor);

}
