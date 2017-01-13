/*
 *
 */
package info.sliceoflife.builder.herobuilder.impl;

/**
 * Weapon enumeration
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public enum Weapon {

  DAGGER, SWORD, AXE, WARHAMMER, BOW;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
