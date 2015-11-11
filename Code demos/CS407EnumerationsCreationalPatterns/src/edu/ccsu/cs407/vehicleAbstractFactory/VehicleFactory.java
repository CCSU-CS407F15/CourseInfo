package edu.ccsu.cs407.vehicleAbstractFactory;

/**
 * Abstract factory for creating vehicles
 */
public interface VehicleFactory {
  public Vehicle makeVehicle(String parameters);
}
