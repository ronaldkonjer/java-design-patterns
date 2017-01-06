package info.sliceoflife.abstractfactory.kingdomfactory.impl;

import info.sliceoflife.abstractfactory.kingdomfactory.Army;
import info.sliceoflife.abstractfactory.kingdomfactory.Castle;
import info.sliceoflife.abstractfactory.kingdomfactory.King;
import info.sliceoflife.abstractfactory.kingdomfactory.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {

  @Override
  public King createKing() {
    return new OrcKing();
  }

  @Override
  public Castle createCastle() {
    return new OrcCastle();
  }

  @Override
  public Army createArmy() {
    return new OrcArmy();
  }

}
