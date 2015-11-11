package edu.ccsu.cs407.vehiclePrototypeFactory;

import edu.ccsu.cs407.vehicleFactoryMethod.*;
import edu.ccsu.cs407.vehicleAbstractFactory.*;
import edu.ccsu.cs407.enumeration.Direction;

/**
 * Vehicle movement strategy
 */
public interface MovementStrategy extends Cloneable{
  public void move(Direction d);
  public MovementStrategy clone();
}
