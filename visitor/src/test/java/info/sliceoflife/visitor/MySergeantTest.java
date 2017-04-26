package info.sliceoflife.visitor;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

import info.sliceoflife.visitor.composite.impl.MySergeant;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

/**
 * Test MySergeant
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySergeantTest extends MyUnitTest<MySergeant> {

  /**
   * Create a new test instance for the given {@link MySergeant}
   */
  public MySergeantTest() {
    super(MySergeant::new);
  }

  @Override
  void verifyVisit(final MySergeant unit, final MyUnitVisitor mockedVisitor) {
    verify(mockedVisitor).visitSergeant(eq(unit));
  }

}
