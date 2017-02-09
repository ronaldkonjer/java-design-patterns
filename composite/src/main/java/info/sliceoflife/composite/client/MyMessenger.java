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
