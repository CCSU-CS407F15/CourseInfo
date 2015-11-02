package edu.ccsu.cs407.composite;

/**
 * Demonstrate composite pattern
 */
public class Main {

  public static void main(String[] args) {
    // Construct part-whole hierarchy
    ComputerComposite graphicsCard = new GraphicsCard();
    graphicsCard.add(new CPU());
    graphicsCard.add(new RAMChip());
    ComputerComposite motherboard = new Motherboard();
    motherboard.add(graphicsCard);
    motherboard.add(new CPU());
    motherboard.add(new CPU());
    motherboard.add(new RAMChip());
    motherboard.add(new RAMChip());

    ComputerComposite composite = motherboard;
    // What client would see
    double price = composite.getPriceTotal();
    System.out.println("Total price: "+price);
  }
}
