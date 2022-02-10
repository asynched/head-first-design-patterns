package src.strategy.examples.behaviors.quack;

/**
 * Quack is a quack behavior that allows an entity to quack.
 */
public class Quack implements IQuackBehavior {
  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
