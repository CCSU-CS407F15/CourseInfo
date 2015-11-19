package edu.ccsu.cs407.visitor.vehicle;

public interface VehicleVisitable {
  public void accept(VehicleVisitor visitor);
}
