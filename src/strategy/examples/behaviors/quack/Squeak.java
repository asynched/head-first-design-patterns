package src.strategy.examples.behaviors.quack;

/**
 * Squeak is a quack behavior that allows an entity to squeak.
 */
public class Squeak implements IQuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
