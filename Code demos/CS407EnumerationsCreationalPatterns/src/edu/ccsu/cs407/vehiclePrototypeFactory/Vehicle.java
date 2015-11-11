package edu.ccsu.cs407.vehiclePrototypeFactory;

import edu.ccsu.cs407.vehicleFactoryMethod.*;
import edu.ccsu.cs407.vehicleAbstractFactory.*;
import edu.ccsu.cs407.enumeration.Direction;

/**
 * Vehicle interface that extends cloneable
 */
public interface Vehicle extends Cloneable{
  public void move(Direction d);
  public double getVehicleSoundLevel();
  public Vehicle clone();
}
