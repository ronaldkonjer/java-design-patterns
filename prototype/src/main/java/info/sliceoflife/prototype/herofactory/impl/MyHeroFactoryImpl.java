package info.sliceoflife.prototype.herofactory.impl;

import info.sliceoflife.prototype.herofactory.MyHeroFactory;
import info.sliceoflife.prototype.heroprototype.impl.MyBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyMage;
import info.sliceoflife.prototype.heroprototype.impl.MyWarlord;

/**
 * Concrete factory class.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyHeroFactoryImpl implements MyHeroFactory {

  private final MyMage mage;
  private final MyWarlord warlord;
  private final MyBeast beast;

  /**
   * Constructor
   *
   * @param mage the mage class
   * @param warlord the warlord class
   * @param beast the beast class
   */
  public MyHeroFactoryImpl(final MyMage mage, final MyWarlord warlord, final MyBeast beast) {
    this.mage = mage;
    this.warlord = warlord;
    this.beast = beast;
  }

  /**
   * Create MyMage
   */

  @Override
  public MyMage createMage() {
    try {
      return mage.clone();
    } catch (final CloneNotSupportedException e) {
      return null;
    }
  }

  /**
   * create MyWarlord
   */

  @Override
  public MyWarlord createWarlord() {
    try {
      return warlord.clone();
    } catch (final CloneNotSupportedException e) {
      return null;
    }

  }

  /**
   * create Beast
   */
  @Override
  public MyBeast createBeast() {
    try {
      return beast.clone();
    } catch (final CloneNotSupportedException e) {
      return null;
    }
  }

}
