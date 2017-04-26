package info.sliceoflife.visitor.composite;

import info.sliceoflife.visitor.visitor.MyUnitVisitor;

/**
 * Interface for the nodes in hierarchy
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyUnit {

  private final MyUnit[] children;

  public MyUnit(final MyUnit... children) {
    this.children = children;
  }

  /**
   * Accept visitor
   */
  public void accept(final MyUnitVisitor visitor) {
    for (final MyUnit child : children) {
      child.accept(visitor);
    }
  }

}
