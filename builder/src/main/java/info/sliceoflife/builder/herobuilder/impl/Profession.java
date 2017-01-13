/*
 *
 */
package info.sliceoflife.builder.herobuilder.impl;

/**
 * Profession enumeration
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public enum Profession {

  WARRIOR, THIEF, MAGE, PRIEST;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
