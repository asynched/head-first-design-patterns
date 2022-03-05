package src.observer.examples.observers;

public interface IObserver<T> {
  void update(T notification);
}
