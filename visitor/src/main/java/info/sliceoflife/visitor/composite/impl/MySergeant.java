package info.sliceoflife.visitor.composite.impl;

import info.sliceoflife.visitor.composite.MyUnit;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

/**
 * MySergeant
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySergeant extends MyUnit {

  public MySergeant(final MyUnit... children) {
    super(children);
  }

  @Override
  public void accept(final MyUnitVisitor visitor) {
    visitor.visitSergeant(this);
    super.accept(visitor);
  }

  @Override
  public String toString() {
    return "sergeant";
  }
}
