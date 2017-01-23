package info.sliceoflife.prototype.heroprototype.impl;

/**
 * ElfWarlord
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyElfWarlord extends MyWarlord {

  @Override
  public MyWarlord clone() throws CloneNotSupportedException {
    return new MyElfWarlord();
  }

  @Override
  public String toString() {
    return "Elven warlord";
  }

}
