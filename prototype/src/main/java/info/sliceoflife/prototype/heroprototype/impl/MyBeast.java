package info.sliceoflife.prototype.heroprototype.impl;

import info.sliceoflife.prototype.heroprototype.MyPrototype;

/**
 * Beast
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public abstract class MyBeast extends MyPrototype {

  @Override
  public abstract MyBeast clone() throws CloneNotSupportedException;

}
