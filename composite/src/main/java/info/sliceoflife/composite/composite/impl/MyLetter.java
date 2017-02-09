/*
 *
 */
package info.sliceoflife.composite.composite.impl;

import info.sliceoflife.composite.composite.MyLetterComposite;

/**
 * Letter
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyLetter extends MyLetterComposite {

  private final char c;

  /**
   * Constructor
   */
  public MyLetter(final char c) {
    this.c = c;
  }

  @Override
  protected void printThisBefore() {
    System.out.print(c);
  }

  @Override
  protected void printThisAfter() {
    // nothing
  }

}
