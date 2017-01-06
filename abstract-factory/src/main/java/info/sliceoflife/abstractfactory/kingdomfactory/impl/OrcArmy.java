package info.sliceoflife.abstractfactory.kingdomfactory.impl;

import info.sliceoflife.abstractfactory.kingdomfactory.Army;

public class OrcArmy implements Army {

  public static final String DESCRIPTION = "This is the Orc Army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
