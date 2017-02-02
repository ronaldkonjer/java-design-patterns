package info.sliceoflife.facade;

import info.sliceoflife.facade.dwarvengoldmine.facade.MyDwarvenGoldmineFacade;

/**
 * The Facade design pattern is often used when a system is very complex or difficult to
 * understand because the system has a large number of interdependent classes or its
 * source code is unavailable. This Pattern hides the complexities of the larger system and
 * provides a single interface to the client. It typically involves a single wrapper class
 * which contains a set of members required by the client. These members access the system
 * on behalf of the Facade client and hide the implementation details.
 * <p>
 * In this example the Facade is ({@link MyDwarvenGoldmineFacade}) and it provides a simpler
 * interface tp the goldmine sybsystem.
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
    final MyDwarvenGoldmineFacade facade = new MyDwarvenGoldmineFacade();
    facade.startNewDay();
    facade.digOutGold();
    facade.endDay();
  }

}
