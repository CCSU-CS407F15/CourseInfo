/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs407.composite;

import java.util.Iterator;

/**
 * Obviously this class would need to have additional functionality
 * to justify actually being a class.
 */
public class Motherboard extends ComputerComposite{
  @Override
  protected double getCompositeBasePrice() {
    return 150;
  }
}
