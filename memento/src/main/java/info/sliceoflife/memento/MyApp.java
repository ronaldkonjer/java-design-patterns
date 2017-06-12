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
package info.sliceoflife.memento;

import info.sliceoflife.memento.memento.MyStarMemento;
import info.sliceoflife.memento.memento.impl.MyStar;
import info.sliceoflife.memento.memento.impl.MyStarType;

import java.util.Stack;

/**
 * The Memento Pattern is a software design pattern that provides the ability to restore an object
 * to its previous state (undo via rollback).
 * <p>
 * The Memento Pattern is implemented with three objects: the originator, a caretaker and a memento.
 * The Originator is some object that has an internal state. The Caretaker is going to do something
 * to the originator, but wants to be able to undo the change. The Caretaker first asks the
 * Originator for a Memento object. Then it does whatever operation (or sequence of operations) it
 * was going to do. To roll back to the state before the operations, it returns the Memento object
 * to the Originator. The Memento object itself is an opaque object (one which the Caretaker cannot,
 * or should not, change). When using this pattern, care should be taken if the Originator may
 * change other objects or resources - the Memento Patter operates on a single object.
 * <p>
 * In this example the object {@link MyStar}) gives out a "Memento" ({@link MyStarMemento}) that
 * contains the state of the object. Later on the Memento can be set back to the object restoring
 * the state.
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
    final Stack<MyStarMemento> states = new Stack<>();

    final MyStar star = new MyStar(MyStarType.SUN, 10000000, 500000);
    System.out.println(star);
    states.add(star.getMemento());
    star.timePasses();
    System.out.println(star);
    states.add(star.getMemento());
    star.timePasses();
    System.out.println(star);
    states.add(star.getMemento());
    star.timePasses();
    System.out.println(star);
    states.add(star.getMemento());
    star.timePasses();
    System.out.println(star);
    while (states.size() > 0) {
      star.setMemento(states.pop());
      System.out.println(star);
    }

  }

}
