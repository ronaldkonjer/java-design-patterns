package info.sliceoflife.visitor;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

import info.sliceoflife.visitor.composite.impl.MySoldier;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

/**
 * Test MySoldier
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySoldierTest extends MyUnitTest<MySoldier> {

  public MySoldierTest() {
    super(MySoldier::new);
  }

  @Override
  void verifyVisit(final MySoldier unit, final MyUnitVisitor mockedVisitor) {
    verify(mockedVisitor).visitSoldier(eq(unit));
  }

}
