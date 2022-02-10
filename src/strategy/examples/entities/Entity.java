package src.strategy.examples.entities;

/**
 * Generic base class for an entity
 */
public abstract class Entity {
  protected String name;

  public Entity(String name) {
    this.name = name;
  }

  /**
   * Makes the entity print a hello message to stdout.
   */
  public void sayHello() {
    System.out.println("Hello, I'm " + name + "!");
  }
}