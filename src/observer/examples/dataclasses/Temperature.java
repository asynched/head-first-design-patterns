package src.observer.examples.dataclasses;

public class Temperature {
  public float temperature;
  public float humidity;
  public float pressure;

  public Temperature(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
  }
}
