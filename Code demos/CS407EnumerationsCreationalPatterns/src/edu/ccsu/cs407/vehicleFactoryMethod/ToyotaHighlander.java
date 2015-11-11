package edu.ccsu.cs407.vehicleFactoryMethod;

import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 * Concrete class
 */
public class ToyotaHighlander extends Car{
  public ToyotaHighlander(BaseEngine engine, Transmission transmission){
    super(engine,transmission,6,4);
  }
}
