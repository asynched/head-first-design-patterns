package src.strategy.examples;

import src.strategy.examples.behaviors.fly.IFlyBehavior;
import src.strategy.examples.behaviors.quack.IQuackBehavior;
import src.strategy.examples.entities.Entity;

/**
 * Duck is a generic entity that can fly and quack.
 * 
 * It's behavior must be composed at runtime.
 */
public class Duck extends Entity {
  public String name;
  private IFlyBehavior flyBehavior;
  private IQuackBehavior quackBehavior;

  /**
   * Constructor for a duck object, all dependencies are injected and
   * is based on the "composition over inheritance" principle.
   * 
   * @param name          Name of the duck.
   * @param flyBehavior   Fly behavior of the duck.
   * @param quackBehavior Quack behavior of the duck.
   */
  public Duck(String name, IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
    super(name + " 🦆");
    this.quackBehavior = quackBehavior;
    this.flyBehavior = flyBehavior;
  }

  /**
   * Performs the quack action for the duck instance.
   */
  public void performQuack() {
    quackBehavior.quack();
  }

  /**
   * Performs the fly action for the duck instance.
   */
  public void performFly() {
    flyBehavior.fly();
  }

}
