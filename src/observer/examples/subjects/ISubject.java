package src.observer.examples.subjects;

import src.observer.examples.observers.IObserver;

public interface ISubject<T> {
  void registerObserver(IObserver<T> observer);

  void removeObserver(IObserver<T> observer);

  void notifyObservers(T notification);
}
