// Base Class Vehicle
class Gadget {

  // Private Fields
  private String make; 
  private String color; 
  private int year;      
  private String model;   


  // Parameterized Constructor
  public Gadget(String make, String color, int year, String model) {
    this.make = make;
    this.color = color;
    this.year = year;  
    this.model = model; 
  }

  // public method to print details
  public void printDetails() {
    System.out.println("Manufacturer: " + make);
    System.out.println("Color: " + color);
    System.out.println("Year: " + year);
    System.out.println("Model: " + model);
  }
  
}

// Derived Class Cellphone
class Cellphone extends Gadget {

  // Private field
  private String bodyStyle;

  // Parameterized Constructor
  public Cellphone(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model);  //calling parent class constructor
    this.bodyStyle = bodyStyle;       
  }

  public void cellphoneDetails() {  //details of cellphone
    printDetails();         //calling method from parent class
    System.out.println("Body Style: " + bodyStyle);
  }
  
}

class Main {

  public static void main(String[] args) {
    Cellphone macos = new Car("Iphone", "Red", 2021, "macos", "13 pro"); //creation of cellphone Object
    macos.cellphoneDetails(); //calling method to print details
  }
}

// Hey everyone is this ok?