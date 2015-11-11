package edu.ccsu.cs407.builder.simple;

public class Person {

  private final String first;   //required
  private final String last;    //required
  private MaritalStatus maritalStatus;  //optional
  private Double height;        //optional
  private String jobTitle;      //optional
  

  private Person(PersonBuilder builder) {
    this.first = builder.first;
    this.last = builder.last;
    this.maritalStatus = builder.maritalStatus;
    this.height = builder.height;
    this.jobTitle = builder.jobTitle;
  }

  public static class PersonBuilder {
    // required parameters
    private String first = null;   
    private String last = null;
    // optional parameters
    private MaritalStatus maritalStatus = null;
    private Double height = null;
    private String jobTitle = null;
    
    public PersonBuilder(String first, String last){
      this.first = first;
      this.last = last;
    }
    
    public Person buildPerson(){
      return new Person(this);
    }

    public PersonBuilder setMaritialStatus(MaritalStatus maritialStatus){
      this.maritalStatus = maritialStatus;
      return this;
    }
    /**
     * @param height the height to set
     */
    public PersonBuilder setHeight(Double height) {
      this.height = height;
      return this;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public PersonBuilder setJobTitle(String jobTitle) {
      this.jobTitle = jobTitle;
      return this;
    }
  }
}
