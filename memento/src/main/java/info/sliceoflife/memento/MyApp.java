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
