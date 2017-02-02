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

  /**
   * Hero constuctor that uses the builder
   *
   * @param builder the builder
   */
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
