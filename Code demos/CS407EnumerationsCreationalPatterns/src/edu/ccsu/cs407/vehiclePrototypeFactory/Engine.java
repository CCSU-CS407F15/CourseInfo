package edu.ccsu.cs407.vehiclePrototypeFactory;

import edu.ccsu.cs407.vehicleFactoryMethod.*;

/**
 * Interface to allow decorator pattern
 */
public interface Engine extends Cloneable{
  public double getEngineSound();
  public Engine clone();
}
