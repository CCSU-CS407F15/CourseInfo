package edu.ccsu.cs407.vehicleFactoryMethod;

import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 * Concrete class
 */
public class Scooter extends VehicleBase{

  public Scooter(){
    super(new HumanPowered());
  }
  @Override
  public double getVehicleSoundLevel() {
    return .1;
  }
  
}
