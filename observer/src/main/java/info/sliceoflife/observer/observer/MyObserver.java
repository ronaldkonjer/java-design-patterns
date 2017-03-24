package info.sliceoflife.observer.observer;

import info.sliceoflife.observer.observable.MyObservable;

/**
 * Observer
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public interface MyObserver<S extends MyObservable<S, O, A>, O extends MyObserver<S, O, A>, A> {

  void update(S subject, A argument);

}
