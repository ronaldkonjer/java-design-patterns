package info.sliceoflife.visitor;

import info.sliceoflife.visitor.visitor.impl.MyCommanderVisitor;

import java.util.Optional;

/**
 * Test MyCommanderVisitor
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyCommanderVisitorTest extends MyVisitorTest<MyCommanderVisitor> {

  /**
   * Create a new test instance for the given visitor
   */
  public MyCommanderVisitorTest() {
    super(
        new MyCommanderVisitor(),
        Optional.of("Good to see you commander"),
        Optional.empty(),
        Optional.empty());
  }

}
