package info.sliceoflife.adapter;

import info.sliceoflife.adapter.adaptee.MyFishingBoat;
import info.sliceoflife.adapter.adapter.MyBattleFishingBoat;
import info.sliceoflife.adapter.adapter.MyBattleShip;
import info.sliceoflife.adapter.client.MyCaptain;

/**
 * An adapter helps two incompatible interfaces to work together. This is the real world
 * definition for an adapter. Interfaces may be incompatible but the inner functionality
 * should suit the need. The Adapter design pattern allow otherwise incompatible classes
 * to work together by converting the interface of one class into an interface expected by
 * the clients.
 * <p>
 * There are two variations of the Adapter pattern; The class adapter implements the adaptee
 * interface whereas the object adapter uses composition to contain the adaptee in the adapter
 * object. This example uses the object adapter approach.
 * <p>
 * The Adapter ({@link MyBattleFishingBoat}) converts the interface of the adaptee class
 * ({@link MyFishingBoat}) into a suitable one expected by the client ({@link MyBattleShip}).
 * <p>
 * The story of this implementation is this. <br>
 * Pirates are coming! we need a {@link MyBattleShip} to fight! We need a {@link MyFishingBoat}
 * and our captain. We have no time to make up a new ship! We need to reuse this
 * {@link MyFishingBoat}. This captain needs a battleship which can fire and move.
 * We will use the Adapter pattern to reuse {@link MyFishingBoat}.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyApp {

  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(final String[] args) {
    final MyCaptain captain = new MyCaptain(new MyBattleFishingBoat());
    captain.move();
    captain.fire();
  }

}
