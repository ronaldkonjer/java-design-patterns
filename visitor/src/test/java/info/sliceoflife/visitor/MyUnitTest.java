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
