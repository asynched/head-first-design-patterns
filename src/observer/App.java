package src.observer;

import src.observer.examples.implementations.observers.CurrentConditionsDisplay;
import src.observer.examples.implementations.observers.StatisticsDisplay;
import src.observer.examples.implementations.subjects.WeatherData;

public class App {
  public static void main(String[] args) {
    var weatherData = new WeatherData();

    var currentConditions = new CurrentConditionsDisplay();
    var statistics = new StatisticsDisplay();

    weatherData.registerObserver(currentConditions);
    weatherData.registerObserver(statistics);

    weatherData.start();
  }
}
