package info.sliceoflife.prototype.heroprototype.impl;

/**
 * OrcMage
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyOrcMage extends MyMage {

  @Override
  public MyMage clone() throws CloneNotSupportedException {
    return new MyOrcMage();
  }

  @Override
  public String toString() {
    return "Orcish mage";
  }

}
