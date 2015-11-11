package edu.ccsu.cs407.vehicleFactoryMethod;

import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 * Main class
 */
public class Main {

  public static void main(String[] args) {
    CarCreator creator = new ToyotaCreator();
    Vehicle vehicle1 = creator.makeVehicle("Small-normal");

    creator = new FordCreator();
    vehicle1 = creator.makeVehicle("Huge");
  }
}
