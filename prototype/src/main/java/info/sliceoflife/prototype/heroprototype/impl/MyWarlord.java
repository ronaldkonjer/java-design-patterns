package info.sliceoflife.prototype.heroprototype.impl;

import info.sliceoflife.prototype.heroprototype.MyPrototype;

/**
 * Warlord
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public abstract class MyWarlord extends MyPrototype {

  @Override
  public abstract MyWarlord clone() throws CloneNotSupportedException;
}
