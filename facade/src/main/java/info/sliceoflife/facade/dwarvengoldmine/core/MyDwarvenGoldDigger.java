/*
 *
 */
package info.sliceoflife.facade.dwarvengoldmine.core;

/**
 * MyDwarvenGoldDigger is one of the goldmine subsystems.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyDwarvenGoldDigger extends MyDwarvenMineWorker {

  @Override
  public void work() {
    System.out.println(name() + " digs for gold.");
  }

  @Override
  public String name() {
    return "Dwarf gold digger";
  }

}
