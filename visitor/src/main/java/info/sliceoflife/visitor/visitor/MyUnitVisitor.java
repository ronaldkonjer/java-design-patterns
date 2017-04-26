package info.sliceoflife.visitor.visitor;

import info.sliceoflife.visitor.composite.impl.MyCommander;
import info.sliceoflife.visitor.composite.impl.MySergeant;
import info.sliceoflife.visitor.composite.impl.MySoldier;

/**
 * MyVisitor interface
 */
public interface MyUnitVisitor {

  void visitSergeant(MySergeant sergeant);

  void visitCommander(MyCommander commander);

  void visitSoldier(MySoldier soldier);

}
