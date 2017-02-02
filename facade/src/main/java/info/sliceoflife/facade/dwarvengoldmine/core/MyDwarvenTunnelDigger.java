/*
 *
 */
package info.sliceoflife.facade.dwarvengoldmine.core;

/**
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyDwarvenTunnelDigger extends MyDwarvenMineWorker {

  @Override
  public void work() {
    System.out.println(name() + " creates another promising tunnel.");
  }

  @Override
  public String name() {
    return "Dwarven tunnel digger";
  }

}
