package info.sliceoflife.visitor.visitor.impl;

import info.sliceoflife.visitor.composite.impl.MyCommander;
import info.sliceoflife.visitor.composite.impl.MySergeant;
import info.sliceoflife.visitor.composite.impl.MySoldier;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

/**
 * MyCommanderVisitor
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyCommanderVisitor implements MyUnitVisitor {

  @Override
  public void visitSergeant(final MySergeant sergeant) {
    // TODO Auto-generated method stub

  }

  @Override
  public void visitCommander(final MyCommander commander) {
    System.out.println("Good to see you " + commander);

  }

  @Override
  public void visitSoldier(final MySoldier soldier) {
    // TODO Auto-generated method stub

  }

}
