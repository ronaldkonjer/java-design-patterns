/*
 *
 */
package info.sliceoflife.facade.dwarvengoldmine.core;

/**
 * MyDwarvenCartOperator is one of the goldmine subsystems
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyDwarvenCartOperator extends MyDwarvenMineWorker {

  @Override
  public void work() {
    System.out.println(name() + " moves gold chunks out of the mine.");
  }

  @Override
  public String name() {
    return "Dwarf cart operator";
  }

}
