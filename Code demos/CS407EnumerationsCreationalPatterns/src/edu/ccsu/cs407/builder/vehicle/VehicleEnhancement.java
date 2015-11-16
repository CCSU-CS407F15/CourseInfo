package edu.ccsu.cs407.builder.vehicle;

/**
 * General types of vehicle enhancements
 */
public enum VehicleEnhancement {
  FAST("fast"),
  COMFORT("comfort");
  private final String enhancementDescription;
  private VehicleEnhancement(String enhancementDescription){
    this.enhancementDescription = enhancementDescription;
  }

  public String toString(){
    return enhancementDescription;
  }
}
