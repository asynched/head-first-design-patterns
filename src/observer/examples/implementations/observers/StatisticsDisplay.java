package src.observer.examples.implementations.observers;

import java.util.ArrayList;

import src.observer.examples.dataclasses.Temperature;
import src.observer.examples.implementations.IDisplayable;
import src.observer.examples.observers.IObserver;

public class StatisticsDisplay implements IObserver<Temperature>, IDisplayable {
  private ArrayList<Temperature> temperatures;

  public StatisticsDisplay() {
    this.temperatures = new ArrayList<>();
  }

  @Override
  public void display() {
    var total = this.temperatures.size() - 1;
    var medianTemperature = this.temperatures.stream().map((temp) -> temp.temperature).reduce((acc, curr) -> acc + curr)
        .get() / total;
    var lastTemperature = this.temperatures.get(total).temperature;

    System.out.println("\n[STATISTICS]");
    System.out.printf("Current temperature is: %.2f°C 🌡️\n", lastTemperature);
    System.out.printf("Average temperature us: %.2f°C 🌡️\n", medianTemperature);
  }

  @Override
  public void update(Temperature notification) {
    this.temperatures.add(notification);
    this.display();
  }
}
