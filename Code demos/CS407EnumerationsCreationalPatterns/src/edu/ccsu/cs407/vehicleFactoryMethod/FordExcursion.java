package edu.ccsu.cs407.vehicleFactoryMethod;

import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 * Concrete factory
 */
public class FordExcursion extends Car{
    public FordExcursion(BaseEngine engine, Transmission transmission){
    // 4 seats, 2 doors
    super(engine,transmission,6,4);
  }
}
