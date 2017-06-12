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
