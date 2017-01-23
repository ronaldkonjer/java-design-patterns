package info.sliceoflife.prototype.heroprototype.impl;

/**
 * OrcWarlord
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyOrcWarlord extends MyWarlord {

  @Override
  public MyWarlord clone() throws CloneNotSupportedException {
    return new MyOrcWarlord();
  }

  @Override
  public String toString() {
    return "Orcish warlord";
  }

}
