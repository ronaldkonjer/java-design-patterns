package info.sliceoflife.abstractfactory.kingdomfactory;

/**
 * The Kingdom Factory Interface.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public interface KingdomFactory {

  King createKing();

  Castle createCastle();

  Army createArmy();

}
