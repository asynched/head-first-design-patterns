package src.strategy;

import src.strategy.examples.Duck;
import src.strategy.examples.behaviors.fly.FlyWithRockets;
import src.strategy.examples.behaviors.quack.Squeak;

public class App {
  public static void main(String[] args) {
    // Builds a new duck instance injecting its dependencies at runtime
    // allowing for the duck's behavior to be dynamic.
    var duck = new Duck("Donald", new FlyWithRockets(), new Squeak());

    // Calls the 'fly' method inside it's fly behavior.
    duck.performFly();

    // Calls the 'quack' method inside it's quack behavior.
    duck.performQuack();

    // Generic method from the base class.
    duck.sayHello();
  }
}