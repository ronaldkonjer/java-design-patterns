package info.sliceoflife.visitor.visitor.impl;

import info.sliceoflife.visitor.composite.impl.MyCommander;
import info.sliceoflife.visitor.composite.impl.MySergeant;
import info.sliceoflife.visitor.composite.impl.MySoldier;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

/**
 * MySergeantVisitor
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySergeantVisitor implements MyUnitVisitor {

  @Override
  public void visitSergeant(final MySergeant sergeant) {
    System.out.println("Hello " + sergeant);

  }

  @Override
  public void visitCommander(final MyCommander commander) {
    // TODO Auto-generated method stub

  }

  @Override
  public void visitSoldier(final MySoldier soldier) {
    // TODO Auto-generated method stub

  }

}
