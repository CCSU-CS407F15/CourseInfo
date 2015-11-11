package edu.ccsu.cs407.builder.vehicle;

/**
 * General types of vehicle enhancements
 */
public class VehicleEnhancement {
  private final String enhancementDescription;
  private VehicleEnhancement(String enhancementDescription){
    this.enhancementDescription = enhancementDescription;
  }
  public static final VehicleEnhancement FAST = new VehicleEnhancement("fast");
  public static final VehicleEnhancement COMFORT = new VehicleEnhancement("comfort");
  
  public String toString(){
    return enhancementDescription;
  }
}
