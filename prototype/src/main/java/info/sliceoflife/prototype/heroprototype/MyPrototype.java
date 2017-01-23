package info.sliceoflife.prototype.heroprototype;

/**
 * Prototype
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public abstract class MyPrototype implements Cloneable {

  @Override
  public abstract Object clone() throws CloneNotSupportedException;

}
