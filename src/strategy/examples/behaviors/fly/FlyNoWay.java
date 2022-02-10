package src.strategy.examples.behaviors.fly;

/**
 * FlyNoWay is a FlyBehavior that does nothing.
 */
public class FlyNoWay implements IFlyBehavior {
  @Override
  public void fly() {
    System.out.println("I can't fly! :(");
  }
}
