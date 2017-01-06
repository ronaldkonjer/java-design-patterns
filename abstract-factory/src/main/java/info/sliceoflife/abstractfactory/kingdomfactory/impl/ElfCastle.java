package info.sliceoflife.abstractfactory.kingdomfactory.impl;

import info.sliceoflife.abstractfactory.kingdomfactory.Castle;

public class ElfCastle implements Castle {

  public static final String DESCRIPTION = "This is the Elven Castle!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
