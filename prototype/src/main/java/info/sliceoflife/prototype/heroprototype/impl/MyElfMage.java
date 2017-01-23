package info.sliceoflife.prototype.heroprototype.impl;

/**
 * ElfMage
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyElfMage extends MyMage {

  @Override
  public MyMage clone() throws CloneNotSupportedException {
    return new MyElfMage();
  }

  @Override
  public String toString() {
    return "Elven mage";
  }

}
