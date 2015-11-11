package edu.ccsu.cs407.vehiclePrototypeFactory;

public class Hybrid extends EngineDecorator {

  public Hybrid(Engine decoratedEngine) {
    super(decoratedEngine);
  }

  @Override
  public Hybrid clone() {
    return new Hybrid(decoratedEngine.clone());
  }

  /**
   * Hybrid decorator makes the engine quieter
   */
  @Override
  public double getEngineSound() {
    return decoratedEngine.getEngineSound() * .6;
  }
}
