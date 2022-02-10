package src.strategy.examples.entities;

/**
 * Generic base class for an entity
 */
public abstract class Entity {
  protected String name;

  /**
   * Constructor for a generic entity
   * 
   * @param name The name of the entity
   */
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