package info.sliceoflife.prototype.heroprototype.impl;

/**
 * OrcBeast
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyOrcBeast extends MyBeast {

  @Override
  public MyBeast clone() throws CloneNotSupportedException {
    return new MyOrcBeast();
  }

  @Override
  public String toString() {
    return "Orcish wolf";
  }

}
