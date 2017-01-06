package info.sliceoflife.abstractfactory.kingdomfactory.impl;

import info.sliceoflife.abstractfactory.kingdomfactory.King;

public class ElfKing implements King {

  public static final String DESCRIPTION = "This is the Elven King!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
