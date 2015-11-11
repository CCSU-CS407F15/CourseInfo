package edu.ccsu.cs407.builder.simple;

/**
 * Example enumeration of marital status
 */
public class MaritalStatus {
  private final String description;
  public static final MaritalStatus MARRIED = new MaritalStatus("married");
  public static final MaritalStatus DIVORCED = new MaritalStatus("divorced");
  public static final MaritalStatus SEPARATED = new MaritalStatus("separated");
  public static final MaritalStatus SINGLE = new MaritalStatus("single");
  
  private MaritalStatus(String description){
    this.description = description;
  }
  
  public String toString(){
    return description;
  }
}
