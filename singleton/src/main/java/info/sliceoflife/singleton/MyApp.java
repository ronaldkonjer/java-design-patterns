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
package info.sliceoflife.singleton;

import info.sliceoflife.singleton.towersingleton.MyEnumIvoryTower;
import info.sliceoflife.singleton.towersingleton.MyInitializingOnDemandHolderIdiom;
import info.sliceoflife.singleton.towersingleton.MyIvoryTower;
import info.sliceoflife.singleton.towersingleton.MyThreadSafeDoubleCheckLocking;
import info.sliceoflife.singleton.towersingleton.MyThreadSafeLazyLoadedIvoryTower;

/**
 * Singleton pattern ensures that the class can have only one existing instance per Java classloader
 * instance and provides global access to it.
 * <p/>
 * One of the risks of this pattern is that bugs resulting from setting a singleton up in a
 * distributed environment can be tricky to debug, since it will work fine if you debug with a
 * single classloader. Additionally, these problems can crop up a while after the implementation of
 * a singleton, since they may start out synchronous and only become async with time, so you it may
 * not be clear why you are seeing certain changes in behaviour.
 * <p/>
 * There are many ways to implement the Singleton. The first one is the eagerly initialized instance
 * in {@link MyIvoryTower}. Eager initialization implies that the implementation is thread safe. If
 * you can afford giving up control of the instantiation moment, then this implementation will suit
 * you fine.
 * <p/>
 * The other option to implement eagerly initialized Singleton is enum based Singleton. The example
 * is found in {@link MyEnumIvoryTower}. At first glance the code looks short and simple. However,
 * you
 * should be aware of the downsides including committing to implementation strategy, extending the
 * enum class, serializability and restrictions to coding. These are extensively discussed in Stack
 * Overflow:
 * http://programmers.stackexchange.com/questions/179386/what-are-the-downsides-of-implementing
 * -a-singleton-with-javas-enum
 * <p/>
 * {@link MyThreadSafeLazyLoadedIvoryTower} is a Singleton implementation that is initialized on
 * demand. The downside is that it is very slow to access since the whole access method is
 * synchronized.
 * <p/>
 * Another Singleton implementation that is initialized on demand is found in
 * {@link MyThreadSafeDoubleCheckLocking}. It is somewhat faster than
 * {@link MyThreadSafeLazyLoadedIvoryTower} since it doesn't synchronize the whole access method but
 * only the method internals on specific conditions.
 * <p/>
 * Yet another way to implement thread safe lazily initialized Singleton can be found in
 * {@link MyInitializingOnDemandHolderIdiom}. However, this implementation requires at least Java 8
 * API level to work.
 */
public class MyApp {

  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(final String[] args) {
    final MyIvoryTower ivoryTower1 = MyIvoryTower.getInstance();
    final MyIvoryTower ivoryTower2 = MyIvoryTower.getInstance();
    System.out.println("ivoryTower1=" + ivoryTower1);
    System.out.println("ivoryTower2=" + ivoryTower2);

    // lazily initialized singleton
    final MyThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = MyThreadSafeLazyLoadedIvoryTower.getInstance();
    final MyThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = MyThreadSafeLazyLoadedIvoryTower.getInstance();
    System.out.println("threadSafeIvoryTower1=" + threadSafeIvoryTower1);
    System.out.println("threadSafeIvoryTower2=" + threadSafeIvoryTower2);

    // enum singleton
    final MyEnumIvoryTower enumIvoryTower1 = MyEnumIvoryTower.INSTANCE;
    final MyEnumIvoryTower enumIvoryTower2 = MyEnumIvoryTower.INSTANCE;
    System.out.println("enumIvoryTower1=" + enumIvoryTower1);
    System.out.println("enumIvoryTower2=" + enumIvoryTower2);

    // double checked locking
    final MyThreadSafeDoubleCheckLocking dcl1 = MyThreadSafeDoubleCheckLocking.getInstance();
    System.out.println(dcl1);
    final MyThreadSafeDoubleCheckLocking dcl2 = MyThreadSafeDoubleCheckLocking.getInstance();
    System.out.println(dcl2);

    // initialize on demand holder idiom
    final MyInitializingOnDemandHolderIdiom demandHolderIdiom1 = MyInitializingOnDemandHolderIdiom.getInstance();
    System.out.println(demandHolderIdiom1);
    final MyInitializingOnDemandHolderIdiom demandHolderIdiom2 = MyInitializingOnDemandHolderIdiom.getInstance();
    System.out.println(demandHolderIdiom2);
  }

}
