/*
 *
 */
package info.sliceoflife.singleton.towersingleton;

/**
 * The Initialize-on-demand-holder idiom is a secure way of creating a lazy initialized Singleton
 * object in Java,
 * <p>
 * The technique is as lazy as possible and works in all known versions of Java. It takes
 * advantage of language guarantees about class initialization, and will therefore work
 * correctly in all Java-compliant compilers and virtual machines.
 * <p>
 * This inner class is referenced no earlier (and therefore loaded no earlier by the class
 * loader) that the moment that getInstance() is called. Thus, this solution is thread-safe
 * without required special language constructs (i.e. volatile or synchronized)
 * 
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyInitializingOnDemandHolderIdiom {

  private MyInitializingOnDemandHolderIdiom() {}

  /**
   * @return Singleton instance
   */
  public static MyInitializingOnDemandHolderIdiom getInstance() {
    return HelperHolder.INSTANCE;
  }

  /**
   * Provides the lazy-loaded Singleton instance.
   */
  private static class HelperHolder {

    private static final MyInitializingOnDemandHolderIdiom INSTANCE =
        new MyInitializingOnDemandHolderIdiom();
  }

}
