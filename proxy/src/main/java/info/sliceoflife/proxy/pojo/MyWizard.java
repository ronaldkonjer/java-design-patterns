/*
 *
 */
package info.sliceoflife.proxy.pojo;

/**
 * Wizard
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyWizard {

  private final String name;

  public MyWizard(final String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

}
