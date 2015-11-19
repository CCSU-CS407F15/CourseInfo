package edu.ccsu.cs407.visitor.vehicle;

/**
 * Simple wheel.
 */
public class Wheel implements VehicleVisitable{
  public String getWheelSize(){
    return "18in";
  }
  
  public String toString(){
    return "Wheel";
  }

  @Override
  public void accept(VehicleVisitor visitor) {
    visitor.visitWheel(this);
  }
}
