
package info.sliceoflife.abstractfactory;

import info.sliceoflife.abstractfactory.kingdomfactory.Army;
import info.sliceoflife.abstractfactory.kingdomfactory.Castle;
import info.sliceoflife.abstractfactory.kingdomfactory.King;
import info.sliceoflife.abstractfactory.kingdomfactory.KingdomFactory;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.ElfKingdomFactory;
import info.sliceoflife.abstractfactory.kingdomfactory.impl.OrcKingdomFactory;

/**
 * The Abstract Factory pattern provides a way to encapsulate a group of individual factories that
 * have a common theme
 * without specifying their concrete classes. In normal usage, the client software creates a
 * concrete implementation of
 * the abstract factory and then uses the generic interface of the factory to create the concrete
 * objects that are part
 * of the theme. The client does not know (or care) which concrete objects it gets from each of
 * these internal
 * factories, since it uses only the generic interfaces of their products. This pattern separates
 * the details of
 * implementation of a set of objects from their general usage and relies on object composition, as
 * object creation is
 * implemented in methods exposed in the factory interface.
 * <p>
 * The essence of the Abstract Factory pattern is a factory interface ({@link KingdomFactory}) and
 * its implementations (
 * {@link ElfKingdomFactory}, {@link OrcKingdomFactory}). The example uses both concrete
 * implementations to create a
 * king, a castle and an army.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class App {

  private King king;
  private Castle castle;
  private Army army;

  /**
   * Creates the Kingdom
   */
  public void createKingdom(final KingdomFactory factory) {
    setKing(factory.createKing());
    setCastle(factory.createCastle());
    setArmy(factory.createArmy());
  }

  protected King getKing(final KingdomFactory factory) {
    return factory.createKing();
  }

  public King getKing() {
    return king;
  }

  public void setKing(final King king) {
    this.king = king;
  }

  protected Castle getCastle(final KingdomFactory factory) {
    return factory.createCastle();
  }

  public Castle getCastle() {
    return castle;
  }

  public void setCastle(final Castle castle) {
    this.castle = castle;
  }

  protected Army getArmy(final KingdomFactory factory) {
    return factory.createArmy();
  }

  public Army getArmy() {
    return army;
  }

  public void setArmy(final Army army) {
    this.army = army;
  }

  public static void main(final String[] args) {

    final App app = new App();

    System.out.println("Elf Kingdom");
    app.createKingdom(new ElfKingdomFactory());
    System.out.println(app.getArmy().getDescription());
    System.out.println(app.getCastle().getDescription());
    System.out.println(app.getKing().getDescription());

    System.out.println("\nOrc Kingdom");
    app.createKingdom(new OrcKingdomFactory());
    System.out.println(app.getArmy().getDescription());
    System.out.println(app.getCastle().getDescription());
    System.out.println(app.getKing().getDescription());

  }

}
