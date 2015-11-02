/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs407.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Simple composite implementation that uses template pattern
 */
public abstract class ComputerComposite extends ComputerComponent{
  protected List<ComputerComponent> subComponents = new ArrayList<ComputerComponent>();
  public ComputerComposite composite(){
    return this;
  }
  public void add(ComputerComponent component){
    subComponents.add(component);
  }
  public void remove(ComputerComponent component){
    subComponents.remove(component);
  }
  public Iterator<ComputerComponent> iterator(){
    return subComponents.iterator();
  }

  /**
   * Note implemented as template pattern
   * @return price total of this component plus all contained classes
   */
  public double getPriceTotal() {
    double componentPrice = getCompositeBasePrice();
    Iterator<ComputerComponent> subIter = subComponents.iterator();
    while (subIter.hasNext()){
      ComputerComponent computerComp = subIter.next();
      componentPrice += computerComp.getPriceTotal();
    }
    return componentPrice;
  }
  protected abstract double getCompositeBasePrice();
}
