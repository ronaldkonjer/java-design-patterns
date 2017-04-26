package info.sliceoflife.visitor.composite.impl;

import info.sliceoflife.visitor.composite.MyUnit;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

/**
 * MySoldier
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySoldier extends MyUnit {

  public MySoldier(final MyUnit... children) {
    super(children);
  }

  @Override
  public void accept(final MyUnitVisitor visitor) {
    visitor.visitSoldier(this);
    super.accept(visitor);
  }

  @Override
  public String toString() {
    return "soldier";
  }

}
