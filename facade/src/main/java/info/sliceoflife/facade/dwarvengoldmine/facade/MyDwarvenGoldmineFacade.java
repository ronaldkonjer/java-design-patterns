/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
