package edu.ccsu.cs407.vehicleAbstractFactory;

/**
 * Concrete class
 */
public class ToyotaHighlander extends Car{
  public ToyotaHighlander(Engine engine, Transmission transmission){
    super(engine,transmission,6,4);
  }
}
