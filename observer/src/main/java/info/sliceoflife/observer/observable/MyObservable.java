package info.sliceoflife.observer.observable;

import info.sliceoflife.observer.observer.MyObserver;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Generic observer inspired by Java Generics and Collection by Naftalin & Wadler
 *
 * @param <S> Subject
 * @param <O> Observer
 * @param <A> Argument type
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyObservable<S extends MyObservable<S, O, A>, O extends MyObserver<S, O, A>, A> {

  protected List<O> observers;

  public MyObservable() {
    this.observers = new CopyOnWriteArrayList<>();
  }

  public void addObserver(final O observer) {
    this.observers.add(observer);
  }

  public void removeObserver(final O observer) {
    this.observers.remove(observer);
  }

  /**
   * Notify observers
   */
  @SuppressWarnings("unchecked")
  public void notifyObservers(final A argument) {
    for (final O observer : observers) {
      observer.update((S) this, argument);
    }
  }
}
