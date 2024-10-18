package Lab_02.src;

public class Coffee {
  String[] syrups;
  String size;
  String typeVal;

  public Coffee(char size, int type, String[] syrups) {
    switch (size) {
      case 's':
        this.size = "small";
        break;
      case 'm':
        this.size = "medium";
        break;
      case 'l':
        this.size = "large";
        break;
      default:
        this.size = "medium";
    }

    switch (type) {
      case 1:
        this.typeVal = "iced";
        break;
      case 2:
        this.typeVal = "blended";
        break;
      case 3:
        this.typeVal = "hot";
        break;
      default:
        this.size = "hot";
    }
    // provided
    this.syrups = new String[syrups.length];
    for (int i = 0; i < syrups.length; i++) {
      this.syrups[i] = syrups[i];
    }
  }

  // this function returns the size of the drink
  public String getSize() {
    return this.size;
  }

  // this function returns the type of the drink
  public String getType() {
    return this.typeVal;
  }

  // this function returns the syrups in the drink
  public String[] getSyrups() {
    return this.syrups;
  }

  // this function sets the type of the drink
  public void setType(String typ) {
    this.typeVal = typ;
  }

  // this function sets the size of the drink
  public void setSize(String siz) {
    this.size = siz;
  }

  // this function sets the syrups for the drink
  public void setSyrups(String[] syrup) {
    this.syrups = new String[syrup.length];
    for (int i = 0; i < syrup.length; i++) {
      this.syrups[i] = syrup[i];
    }
  }

  // This function will return the total price of the drink, considering size,
  // type, and syrups
  public double calculatePrice() {
    double price = 0.0;
    // student code--your if statements should go here
    switch (getSize()) {
      case "small":
        price = 3.0;
        break;
      case "medium":
        price = 4.0;
        break;
      case "large":
        price = 5.0;
        break;
    }

    if (getType().equals("blended")) {
      price += 0.5;
    }

    for (String syrup : syrups) {
      if (syrup.equals("chocolate") || syrup.equals("vanilla") || syrup.equals("caramel")) {
        price += 0.0;
      } else {
        price += 0.5;
      }
    }

    return price;
  }

  public static void main(String[] args) {
    // String[] tem = { "caramel", "chocolate" };
    // Coffee myOrder = new Coffee('s', 1, tem);
    // System.out.println("TESTING CONSTRUCTOR SIZE: " + myOrder.size); // should return "small"

    // String[] temp = { "caramel", "chocolate" };
    // Coffee myOrder1 = new Coffee('s', 1, temp);
    // System.out.println("TESTING CONSTRUCTOR SIZE: " + myOrder1.getSize()); // should return "small"
    // myOrder1.setSize("medium");
    // System.out.println("TESTING GET SIZE: " + myOrder1.getSize()); // should return "medium"

    // String[] temp1 = { "caramel", "chocolate" };
    // String[] temp2 = { "chocolate", "mint", "lavender" };
    // String[] temp3 = { "mint" };
    // Coffee order1 = new Coffee('s', 1, temp1);
    // Coffee order2 = new Coffee('m', 2, temp2);
    // Coffee order3 = new Coffee('l',2,temp3);
    // System.out.println("TESTING PRICE: " + order1.calculatePrice()); // This should return 3.0
    // System.out.println("TESTING PRICE: " + order2.calculatePrice()); // This should return 5.5
    // System.out.println("TESTING PRICE: " + order3.calculatePrice()); // This should return 6.0


//     Test Failed
// Expected: 6.0
// Actual: 1.0
// Failed calculatePrice(). Expected: 6.0
// Instead got: 1.0
  }
}