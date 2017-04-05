package info.sliceoflife.state;

import info.sliceoflife.state.context.MyMammoth;

/**
 * In the State Pattern the container object has an internal state object that defines the current
 * behavior. The state object can be changed to alter the behavior.
 * <p>
 * This can be a cleaner way for an object to change its behavior at runtime without resorting
 * large monolithic conditional statements and thus improves maintainability.
 * <p>
 * In this example the {@link MyMammoth} changes its behavior as time passes by.
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
    final MyMammoth mammoth = new MyMammoth();
    mammoth.observe();
    mammoth.timePasses();
    mammoth.observe();
    mammoth.timePasses();
    mammoth.observe();

  }

}
