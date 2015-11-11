package edu.ccsu.cs407.vehiclePrototypeFactory;

import edu.ccsu.cs407.vehicleFactoryMethod.*;
import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 * Concrete transmission class
 */
public class ToyotaTransmission implements Transmission{
  public ToyotaTransmission clone(){
    return new ToyotaTransmission();
  }
}
