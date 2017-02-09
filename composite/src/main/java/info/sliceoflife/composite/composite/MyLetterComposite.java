/*
 *
 */
package info.sliceoflife.composite.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite Interface
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyLetterComposite {

  private final List<MyLetterComposite> children = new ArrayList<MyLetterComposite>();

  public void add(final MyLetterComposite letter) {
    children.add(letter);
  }

  public int count() {
    return children.size();
  }

  protected abstract void printThisBefore();

  protected abstract void printThisAfter();

  /**
   * Print
   */
  public void print() {
    printThisBefore();
    for (final MyLetterComposite letter : children) {
      letter.print();
    }
    printThisAfter();
  }

}
