package info.sliceoflife.visitor;

import info.sliceoflife.visitor.visitor.impl.MySoldierVisitor;

import java.util.Optional;

/**
 * Test MySoldierVisitor
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySoldierVisitorTest extends MyVisitorTest<MySoldierVisitor> {

  public MySoldierVisitorTest() {
    super(new MySoldierVisitor(), Optional.empty(), Optional.empty(), Optional.of("Greetings soldier"));
  }

}
