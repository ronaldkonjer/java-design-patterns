package info.sliceoflife.builder.herobuilder;

import info.sliceoflife.builder.herobuilder.impl.Armor;
import info.sliceoflife.builder.herobuilder.impl.HairColor;
import info.sliceoflife.builder.herobuilder.impl.HairType;
import info.sliceoflife.builder.herobuilder.impl.Profession;
import info.sliceoflife.builder.herobuilder.impl.Weapon;

/**
 * The Builder Class
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class Builder {

  public Profession profession;
  public String name;
  public HairType hairType;
  public HairColor hairColor;
  public Armor armor;
  public Weapon weapon;

  public Builder(final Profession profession, final String name) {
    if (profession == null || name == null) {
      throw new IllegalArgumentException("profession and/or name can not be null");
    }
    this.profession = profession;
    this.name = name;
  }

  public Builder withHairType(final HairType hairType) {
    this.hairType = hairType;
    return this;
  }

  public Builder withHairColor(final HairColor hairColor) {
    this.hairColor = hairColor;
    return this;
  }

  public Builder withArmor(final Armor armor) {
    this.armor = armor;
    return this;
  }

  public Builder withWeapon(final Weapon weapon) {
    this.weapon = weapon;
    return this;
  }

  public Hero build() {
    return new Hero(this);
  }

}
