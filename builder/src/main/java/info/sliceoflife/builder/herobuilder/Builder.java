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

  /**
   * Constructor for the Builder to supply every instance with a
   * profession and a name
   *
   * @param profession the profession
   * @param name the name
   */
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
