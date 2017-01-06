package info.sliceoflife.abstractfactory.kingdomfactory.impl;

import info.sliceoflife.abstractfactory.kingdomfactory.King;

public class OrcKing implements King {

  public static final String DESCRIPTION = "This is the Orc King!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
