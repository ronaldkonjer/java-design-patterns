package info.sliceoflife.abstractfactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import info.sliceoflife.abstractfactory.kingdomfactory.Army;
import info.sliceoflife.abstractfactory.kingdomfactory.Castle;
import info.sliceoflife.abstractfactory.kingdomfactory.King;
import info.sliceoflife.abstractfactory.kingdomfactory.KingdomFactory;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.ElfArmy;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.ElfCastle;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.ElfKing;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.ElfKingdomFactory;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.OrcArmy;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.OrcCastle;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.OrcKing;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.OrcKingdomFactory;

import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryTest {

  private final App app = new App();
  private KingdomFactory elfFactory;
  private KingdomFactory orcFactory;

  @Before
  public void setUp() throws Exception {
    elfFactory = new ElfKingdomFactory();
    orcFactory = new OrcKingdomFactory();
  }

  @Test
  public void testKingsFactory() {
    final King elfKing = app.getKing(elfFactory);
    assertTrue(elfKing instanceof ElfKing);
    assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());

    final King orcKing = app.getKing(orcFactory);
    assertTrue(orcKing instanceof OrcKing);
    assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
  }

  @Test
  public void testCastleFactory() {
    final Castle elfCastle = app.getCastle(elfFactory);
    assertTrue(elfCastle instanceof ElfCastle);
    assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDescription());

    final Castle orcCastle = app.getCastle(orcFactory);
    assertTrue(orcCastle instanceof OrcCastle);
    assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
  }

  @Test
  public void testArmyFactory() {
    final Army elfArmy = app.getArmy(elfFactory);
    assertTrue(elfArmy instanceof ElfArmy);
    assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDescription());

    final Army orcArmy = app.getArmy(orcFactory);
    assertTrue(orcArmy instanceof OrcArmy);
    assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDescription());
  }

  @Test
  public void testCreateElfKingdom() {
    app.createKingdom(elfFactory);
    final King king = app.getKing();
    final Castle castle = app.getCastle();
    final Army army = app.getArmy();
    assertTrue(king instanceof ElfKing);
    assertEquals(ElfKing.DESCRIPTION, king.getDescription());
    assertTrue(castle instanceof ElfCastle);
    assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
    assertTrue(army instanceof ElfArmy);
    assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
  }

  @Test
  public void testCreateOrcKingdom() {
    app.createKingdom(orcFactory);
    final King king = app.getKing();
    final Castle castle = app.getCastle();
    final Army army = app.getArmy();
    assertTrue(king instanceof OrcKing);
    assertEquals(OrcKing.DESCRIPTION, king.getDescription());
    assertTrue(castle instanceof OrcCastle);
    assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
    assertTrue(army instanceof OrcArmy);
    assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
  }

}
