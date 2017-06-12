/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package info.sliceoflife.memento.memento.impl;

import info.sliceoflife.memento.memento.MyStarMemento;

/**
 * Star uses "memento" to store and restore state.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyStar {

  private MyStarType type;
  private int ageYears;
  private int massTons;

  /**
   * Constructor
   */
  public MyStar(final MyStarType starType, final int starAge, final int starMass) {
    this.type = starType;
    this.ageYears = starAge;
    this.massTons = starMass;
  }

  /**
   * Makes time pass for the star
   */
  public void timePasses() {
    ageYears *= 2;
    massTons *= 8;
    switch (type) {
      case RED_GIANT:
        type = MyStarType.WHITE_DWARF;
        break;
      case SUN:
        type = MyStarType.RED_GIANT;
        break;
      case SUPERNOVA:
        type = MyStarType.DEAD_STAR;
        break;
      case WHITE_DWARF:
        type = MyStarType.SUPERNOVA;
        break;
      case DEAD_STAR:
        ageYears *= 2;
        massTons = 0;
        break;
      default:
        break;
    }
  }

  /**
   * Get the Momento state
   * @return state the MyStarMomentoInternal state
   */
  public MyStarMemento getMemento() {
    final MyStarMementoInternal state = new MyStarMementoInternal();
    state.setAgeYears(ageYears);
    state.setMassTons(massTons);
    state.setType(type);
    return state;

  }

  /**
   * Set the Momento state
   * @param memento the MyStarMomento state to set
   */
  public void setMemento(final MyStarMemento memento) {
    final MyStarMementoInternal state = (MyStarMementoInternal) memento;
    this.type = state.getType();
    this.ageYears = state.getAgeYears();
    this.massTons = state.getMassTons();

  }

  @Override
  public String toString() {
    return String.format("%s age: %d years mass: %d tons", type.toString(), ageYears, massTons);
  }

  /**
   * MyStarMemento implementation
   */
  private static class MyStarMementoInternal implements MyStarMemento {

    private MyStarType type;
    private int ageYears;
    private int massTons;

    public MyStarType getType() {
      return type;
    }

    public void setType(final MyStarType type) {
      this.type = type;
    }

    public int getAgeYears() {
      return ageYears;
    }

    public void setAgeYears(final int ageYears) {
      this.ageYears = ageYears;
    }

    public int getMassTons() {
      return massTons;
    }

    public void setMassTons(final int massTons) {
      this.massTons = massTons;
    }

  }
}
