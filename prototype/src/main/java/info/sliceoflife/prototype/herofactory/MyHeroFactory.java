package info.sliceoflife.prototype.herofactory;

import info.sliceoflife.prototype.heroprototype.impl.MyBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyMage;
import info.sliceoflife.prototype.heroprototype.impl.MyWarlord;

public interface MyHeroFactory {

  MyMage createMage();

  MyWarlord createWarlord();

  MyBeast createBeast();

}
