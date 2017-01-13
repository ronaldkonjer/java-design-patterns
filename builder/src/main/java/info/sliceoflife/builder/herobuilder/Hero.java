package info.sliceoflife.builder.herobuilder;

import info.sliceoflife.builder.herobuilder.impl.Armor;
import info.sliceoflife.builder.herobuilder.impl.HairColor;
import info.sliceoflife.builder.herobuilder.impl.HairType;
import info.sliceoflife.builder.herobuilder.impl.Profession;
import info.sliceoflife.builder.herobuilder.impl.Weapon;

/**
 * Hero, the class with many parameters
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class Hero {

  private final Profession profession;
  private final String name;
  private final HairColor hairColor;
  private final HairType hairType;
  private final Weapon weapon;
  private final Armor armor;

  public Hero(final Builder builder) {
    this.profession = builder.profession;
    this.name = builder.name;
    this.hairColor = builder.hairColor;
    this.hairType = builder.hairType;
    this.weapon = builder.weapon;
    this.armor = builder.armor;
  }

  public Profession getProfession() {
    return profession;
  }

  public String getName() {
    return name;
  }

  public Armor getArmor() {
    return armor;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public HairType getHairType() {
    return hairType;
  }

  public HairColor getHairColor() {
    return hairColor;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("This is a ").append(profession).append(" named ").append(name);
    if (hairColor != null || hairType != null) {
      sb.append(" with ");
      if (hairColor != null) {
        sb.append(hairColor).append(" ");
      }
      if (hairType != null) {
        sb.append(hairType).append(" ");
      }
      sb.append(hairType != HairType.BALD ? "hair" : "head");
    }
    if (armor != null) {
      sb.append(" wearing ").append(armor);
    }
    if (weapon != null) {
      sb.append(" and wielding a ").append(weapon);
    }
    sb.append(".");
    return sb.toString();
  }
}
