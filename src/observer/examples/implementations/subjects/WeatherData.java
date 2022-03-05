package src.observer.examples.implementations.subjects;

import java.util.ArrayList;
import java.util.Random;

import src.observer.examples.dataclasses.Temperature;
import src.observer.examples.observers.IObserver;
import src.observer.examples.subjects.ISubject;

public class WeatherData implements ISubject<Temperature> {
  private ArrayList<IObserver<Temperature>> observers;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  public void start() {
    var random = new Random();

    try {
      while (true) {
        var temperature = new Temperature(random.nextFloat(), random.nextFloat(), random.nextFloat());
        this.notifyObservers(temperature);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println("Something went wrong whilst trying to sleep");
      e.printStackTrace();
      System.exit(1);
    }
  }

  @Override
  public void notifyObservers(Temperature notification) {
    for (var observer : this.observers) {
      observer.update(notification);
    }
  }

  @Override
  public void registerObserver(IObserver<Temperature> observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(IObserver<Temperature> observer) {
    this.observers.remove(observer);
  }
}
