package edu.ccsu.cs407.vehicleAbstractFactory;

import edu.ccsu.cs407.enumeration.Direction;

/**
 *
 * @author cw1491
 */
public abstract class VehicleBase implements Vehicle{
  private MovementStrategy movementStrategy;
  
  public VehicleBase(MovementStrategy movementStrategy){
    this.movementStrategy = movementStrategy;
  }
  
  protected void setMovementStrategy(MovementStrategy movementStrategy){
    this.movementStrategy = movementStrategy;
  }
  
  protected MovementStrategy getMovementStrategy(){
    return movementStrategy;
  }
  
  public void move(Direction d){
    movementStrategy.move(d);
  }
}
