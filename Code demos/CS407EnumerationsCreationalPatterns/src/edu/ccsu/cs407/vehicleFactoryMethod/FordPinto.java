package edu.ccsu.cs407.vehicleFactoryMethod;

import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 * Concrete FordPinto class
 */
public class FordPinto extends Car{
  public FordPinto(BaseEngine engine, Transmission transmission){
    // 4 seats, 2 doors
    super(engine,transmission,4,2);
  }
}
