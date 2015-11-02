/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs407.decorator;

import edu.ccsu.cs407.composite.ComputerComponent;
import edu.ccsu.cs407.composite.ComputerComposite;

/**
 * Rather than returning the original price checks competitors
 * to see what how the price should be based on the current market price. 
 */
public class MarketPriceAdjusterDecorator extends ComputerComponentDecorator {
  public MarketPriceAdjusterDecorator(ComputerComponent decoratedComponent){
    super(decoratedComponent);
  }
  
  /**
   * Implements added behavior
   */
  protected double getMarketPriceAdjustment(){
    // code that does more extensive/complex operation
    return .9;
  }
  
  @Override
  public double getPriceTotal(){
    double original =  decoratedComponent.getPriceTotal();
    return original * getMarketPriceAdjustment();
  }
}
