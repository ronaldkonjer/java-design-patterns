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
package info.sliceoflife.composite.client;

import info.sliceoflife.composite.composite.MyLetterComposite;
import info.sliceoflife.composite.composite.impl.MyLetter;
import info.sliceoflife.composite.composite.impl.MySentence;
import info.sliceoflife.composite.composite.impl.MyWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Messenger
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyMessenger {

  /**
   * The message test class for the Orcs
   */
  public MyLetterComposite messageFromOrcs() {

    final List<MyWord> words = new ArrayList<MyWord>();

    words.add(new MyWord(Arrays.asList(new MyLetter('W'), new MyLetter('h'), new MyLetter('e'), new MyLetter('r'),
        new MyLetter('e'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('t'), new MyLetter('h'), new MyLetter('e'), new MyLetter(
        'r'), new MyLetter('e'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('i'), new MyLetter('s'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('a'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('w'), new MyLetter('h'), new MyLetter('i'), new MyLetter(
        'p'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('t'), new MyLetter('h'), new MyLetter('e'), new MyLetter(
        'r'), new MyLetter('e'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('i'), new MyLetter('s'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('a'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('w'), new MyLetter('a'), new MyLetter('y'))));

    return new MySentence(words);
  }

  /**
   * The message test class for the Elves
   */
  public MyLetterComposite messageFromElves() {
    final List<MyWord> words = new ArrayList<MyWord>();

    words.add(new MyWord(Arrays.asList(new MyLetter('M'), new MyLetter('u'), new MyLetter('c'), new MyLetter(
        'h'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('w'), new MyLetter('i'), new MyLetter('n'), new MyLetter(
        'd'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('p'), new MyLetter('o'), new MyLetter('u'), new MyLetter(
        'r'), new MyLetter('s'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('f'), new MyLetter('r'), new MyLetter('o'), new MyLetter(
        'm'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('y'), new MyLetter('o'), new MyLetter('u'), new MyLetter(
        'r'))));
    words.add(new MyWord(Arrays.asList(new MyLetter('m'), new MyLetter('o'), new MyLetter('u'), new MyLetter(
        't'), new MyLetter('h'))));

    return new MySentence(words);

  }

}
