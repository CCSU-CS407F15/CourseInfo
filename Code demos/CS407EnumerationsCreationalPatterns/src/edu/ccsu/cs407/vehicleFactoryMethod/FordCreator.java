package edu.ccsu.cs407.vehicleFactoryMethod;

import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 * Concrete factory
 */
public class FordCreator extends CarCreator {

  @Override
  protected Car makeCar(String parameters, BaseEngine engine, Transmission transmission) {
    if (parameters.equals("Small-normal")) {
      return new FordPinto(engine, transmission);
    } else if (parameters.equals("Small-slow")) {
      return new FordPinto(engine, transmission);
    } else if (parameters.equals("Huge")) {
      return new FordExcursion(engine, transmission);
    } else {
      return super.makeCar(parameters, engine, transmission);
    }
  }

  @Override
  protected Transmission makeTransmission(String parameters) {
    return new ToyotaTransmission();    
  }
}
