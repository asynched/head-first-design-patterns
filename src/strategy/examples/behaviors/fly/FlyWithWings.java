package src.strategy.examples.behaviors.fly;

/**
 * Fly with rockets is a fly behavior that allows an entity
 * to fly with wings.
 */
public class FlyWithWings implements IFlyBehavior {
  @Override
  public void fly() {
    System.out.println("I'm flying!");
  }
}
