/*
 *
 */
package info.sliceoflife.composite.composite.impl;

import info.sliceoflife.composite.composite.MyLetterComposite;

import java.util.List;

/**
 * Word
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyWord extends MyLetterComposite {

  /**
   * Constructor
   */
  public MyWord(final List<MyLetter> letters) {
    for (final MyLetter letter : letters) {
      this.add(letter);
    }
  }

  @Override
  protected void printThisBefore() {
    System.out.print(" ");
  }

  @Override
  protected void printThisAfter() {
    // nothing
  }

}
