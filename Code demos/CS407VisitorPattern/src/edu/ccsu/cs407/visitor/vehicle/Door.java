package edu.ccsu.cs407.visitor.vehicle;

/**
 * Represents a door
 */
public class Door implements VehicleVisitable{
  public String getDoorType(){
    return "PlainDoor";
  }
  
  public String toString(){
    return "Door";
  }

  @Override
  public void accept(VehicleVisitor visitor) {
    visitor.visitDoor(this);
  }
}
