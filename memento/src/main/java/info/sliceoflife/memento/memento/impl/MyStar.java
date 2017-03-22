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
   * 
   * @param starType
   * @param starAge
   * @param starMass
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

  public MyStarMemento getMemento() {
    final MyStarMementoInternal state = new MyStarMementoInternal();
    state.setAgeYears(ageYears);
    state.setMassTons(massTons);
    state.setType(type);
    return state;

  }

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
