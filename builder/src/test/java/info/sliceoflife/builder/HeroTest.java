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
package info.sliceoflife.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import info.sliceoflife.builder.herobuilder.Builder;
import info.sliceoflife.builder.herobuilder.Hero;
import info.sliceoflife.builder.herobuilder.impl.Armor;
import info.sliceoflife.builder.herobuilder.impl.HairColor;
import info.sliceoflife.builder.herobuilder.impl.HairType;
import info.sliceoflife.builder.herobuilder.impl.Profession;
import info.sliceoflife.builder.herobuilder.impl.Weapon;

import org.junit.Test;

/**
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class HeroTest {

  /**
   * Test if we get the expected exception when trying to create a hero without a profession
   * throws Exception
   */
  @Test(expected = IllegalArgumentException.class)
  public void testMissingProfession() throws Exception {
    new Builder(null, "Sir without a job");
  }

  /**
   * Test if we get the expected exception when trying to create a hero without a name
   */
  @Test(expected = IllegalArgumentException.class)
  public void testMissingName() throws Exception {
    new Builder(Profession.THIEF, null);

  }

  /**
   * Test if the hero build by the builder has the correct attributes, as required
   */
  @Test
  public void testBuildHero() throws Exception {
    final String heroName = "Sir Lancelot";

    final Hero hero = new Builder(Profession.WARRIOR, heroName).withArmor(Armor.CHAIN_MAIL)
      .withWeapon(Weapon.SWORD)
      .withHairType(HairType.LONG_CURLY)
      .withHairColor(HairColor.BLOND)
      .build();

    assertNotNull(hero);
    assertNotNull(hero.toString());
    assertEquals(Profession.WARRIOR, hero.getProfession());
    assertEquals(heroName, hero.getName());
    assertEquals(Armor.CHAIN_MAIL, hero.getArmor());
    assertEquals(Weapon.SWORD, hero.getWeapon());
    assertEquals(HairType.LONG_CURLY, hero.getHairType());
    assertEquals(HairColor.BLOND, hero.getHairColor());

  }

}
