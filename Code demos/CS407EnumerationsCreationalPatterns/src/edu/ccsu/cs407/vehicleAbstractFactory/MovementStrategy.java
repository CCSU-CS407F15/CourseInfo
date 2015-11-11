package edu.ccsu.cs407.vehicleAbstractFactory;

import edu.ccsu.cs407.enumeration.Direction;

/**
 * Vehicle movement strategy
 */
public interface MovementStrategy {
  public void move(Direction d);
}
