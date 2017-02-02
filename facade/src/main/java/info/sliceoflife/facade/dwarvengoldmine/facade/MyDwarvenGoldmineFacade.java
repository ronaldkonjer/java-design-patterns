/*
 *
 */
package info.sliceoflife.facade.dwarvengoldmine.facade;

import info.sliceoflife.facade.dwarvengoldmine.core.MyDwarvenCartOperator;
import info.sliceoflife.facade.dwarvengoldmine.core.MyDwarvenGoldDigger;
import info.sliceoflife.facade.dwarvengoldmine.core.MyDwarvenMineWorker;
import info.sliceoflife.facade.dwarvengoldmine.core.MyDwarvenTunnelDigger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * MyDwarvenGoldmineFacade provides a single interface through which users can operate
 * the subsystems.
 * This makes the goldmine easier to operate and cuts the dependencies from the goldmine
 * user to the subsystems.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyDwarvenGoldmineFacade {

  private final List<MyDwarvenMineWorker> workers;

  /**
   * Constructor
   */
  public MyDwarvenGoldmineFacade() {
    workers = new ArrayList<MyDwarvenMineWorker>();
    workers.add(new MyDwarvenGoldDigger());
    workers.add(new MyDwarvenCartOperator());
    workers.add(new MyDwarvenTunnelDigger());
  }

  public void startNewDay() {
    makeActions(workers, MyDwarvenMineWorker.Action.WAKE_UP, MyDwarvenMineWorker.Action.GO_TO_MINE);
  }

  public void digOutGold() {
    makeActions(workers, MyDwarvenMineWorker.Action.WORK);
  }

  public void endDay() {
    makeActions(workers, MyDwarvenMineWorker.Action.GO_HOME, MyDwarvenMineWorker.Action.GO_TO_SLEEP);
  }

  private static void makeActions(final Collection<MyDwarvenMineWorker> workers,
      final MyDwarvenMineWorker.Action... actions) {
    for (final MyDwarvenMineWorker worker : workers) {
      worker.action(actions);
    }
  }
}
