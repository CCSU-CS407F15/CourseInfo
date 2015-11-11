package edu.ccsu.cs407.vehicleAbstractFactory;

import edu.ccsu.cs407.enumeration.Direction;

/**
 *
 * @author cw1491
 */
public interface Vehicle {
  public void move(Direction d);
  public double getVehicleSoundLevel();
}
