package info.sliceoflife.abstractfactory.kingdomfactory.impl;

import info.sliceoflife.abstractfactory.kingdomfactory.Army;
import info.sliceoflife.abstractfactory.kingdomfactory.Castle;
import info.sliceoflife.abstractfactory.kingdomfactory.King;
import info.sliceoflife.abstractfactory.kingdomfactory.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {

  @Override
  public King createKing() {
    return new ElfKing();
  }

  @Override
  public Castle createCastle() {
    return new ElfCastle();
  }

  @Override
  public Army createArmy() {
    return new ElfArmy();
  }

}
