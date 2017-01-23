package info.sliceoflife.prototype.heroprototype.impl;

/**
 * ElfBeast
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyElfBeast extends MyBeast {

  @Override
  public MyBeast clone() throws CloneNotSupportedException {
    return new MyElfBeast();
  }

  @Override
  public String toString() {
    return "Elven eagle";
  }
}
