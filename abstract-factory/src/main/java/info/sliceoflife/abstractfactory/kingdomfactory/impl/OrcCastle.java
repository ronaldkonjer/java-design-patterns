package info.sliceoflife.abstractfactory.kingdomfactory.impl;

import info.sliceoflife.abstractfactory.kingdomfactory.Castle;

public class OrcCastle implements Castle {

  public static final String DESCRIPTION = "This is the Orc Castle!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
