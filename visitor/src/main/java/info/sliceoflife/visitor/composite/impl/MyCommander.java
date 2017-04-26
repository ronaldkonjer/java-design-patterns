package info.sliceoflife.visitor.composite.impl;

import info.sliceoflife.visitor.composite.MyUnit;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

/**
 * MyCommander
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyCommander extends MyUnit {

  public MyCommander(final MyUnit... children) {
    super(children);
  }

  @Override
  public void accept(final MyUnitVisitor visitor) {
    visitor.visitCommander(this);
    super.accept(visitor);
  }

  @Override
  public String toString() {
    return "commander";
  }

}
