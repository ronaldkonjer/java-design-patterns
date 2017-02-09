/*
 *
 */
package info.sliceoflife.composite.composite.impl;

import info.sliceoflife.composite.composite.MyLetterComposite;

import java.util.List;

/**
 * Sentence
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MySentence extends MyLetterComposite {

  /**
   * Constructor
   */
  public MySentence(final List<MyWord> words) {
    for (final MyWord word : words) {
      this.add(word);
    }
  }

  @Override
  protected void printThisBefore() {
    // nothing
  }

  @Override
  protected void printThisAfter() {
    System.out.print(".");
  }

}
