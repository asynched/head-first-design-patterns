package src.strategy.examples.behaviors.quack;

/**
 * MuteQuack is a quack behavior that does nothing.
 */
public class MuteQuack implements IQuackBehavior {
  @Override
  public void quack() {
    // Do nothing because the duck is mute.
  }
}
