package info.sliceoflife.visitor;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

import info.sliceoflife.visitor.composite.impl.MyCommander;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

import com.iluwatar.visitor.Commander;

/**
 * Test Commander
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyCommanderTest extends MyUnitTest<MyCommander> {

  /**
   * Create a new test instance for the given {@link Commander}
   */
  public MyCommanderTest() {
    super(MyCommander::new);
  }

  @Override
  void verifyVisit(final MyCommander unit, final MyUnitVisitor mockedVisitor) {
    verify(mockedVisitor).visitCommander(eq(unit));
  }

}
