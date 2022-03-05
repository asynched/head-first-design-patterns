package src.observer.examples.implementations.observers;

import src.observer.examples.dataclasses.Temperature;
import src.observer.examples.implementations.IDisplay;
import src.observer.examples.observers.IObserver;

public class CurrentConditionsDisplay implements IObserver<Temperature>, IDisplay {
  private Temperature temperature;

  @Override
  public void update(Temperature notification) {
    this.temperature = notification;
    this.display();
  }

  @Override
  public void display() {
    System.out.println("\n[CURRENT]");
    System.out.printf("Current temperature is: %.2f°C 🌡️\nAir humidity is: %.2f%% 💧\nPressure is: %.2f.\n",
        this.temperature.temperature, this.temperature.humidity, this.temperature.pressure);
  }
}
