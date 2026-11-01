public class Car {
    String brand;
    String colour;
    double price;

    void displaydetails(String brand, String colour, double price) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;

    }

    public static void main(String[] args) {
       Car c1 = new Car();
       Car c2 = new Car();
       c1.displaydetails("BMW", "Black", 5000000);
         c2.displaydetails("Audi", "White", 6000000);
                 System.out.println("Brand: " + c1.brand);
        System.out.println("Colour: " + c1.colour);        
        System.out.println("Price: " + c1.price);
        System.out.println("Brand: " + c2.brand);
        System.out.println("Colour: " + c2.colour);        
        System.out.println("Price: " + c2.price);
    }
    
}
