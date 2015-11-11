/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs407.builder.simple;

import edu.ccsu.cs407.builder.simple.Person.PersonBuilder;

/**
 * Demonstration of two options for creation using
 * builder
 */
public class Main {
  public static void main(String[] args){
    // Option 1
    PersonBuilder builder = new Person.PersonBuilder("John", "Doe");
    builder.setMaritialStatus(MaritalStatus.MARRIED);
    builder.setJobTitle("Professor");
    Person johnDoe = builder.buildPerson();
    
    // Option 2
    Person janeDoe = new Person.PersonBuilder("Jane", "Doe")
                     .setMaritialStatus(MaritalStatus.MARRIED)
                     .setJobTitle("Professor").buildPerson();
  }
}
