public class Cone extends Circle {
    // Private data field specific to Cone
    private double height;

    // Constructors
    // No-arg constructor (default values)
    public Cone() {
        super(); // Calls the no-arg constructor of Circle (default Circle with radius 1.0 and color "Red")
        this.height = 1.0;
    }

    // Constructor with specified radius
    public Cone(double radius) {
        super(radius); // Calls the constructor of Circle with specified radius and default color "Red"
        this.height = 1.0;
    }

    // Constructor with specified radius and height
    public Cone(double radius, double height) {
        super(radius); // Calls the constructor of Circle with specified radius and default color "Red"
        this.height = height;
    }

    // Constructor with specified radius, height, and color
    public Cone(double radius, double height, String color) {
        super(radius, color); // Calls the constructor of Circle with specified radius and color
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the volume of the cone
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * getRadius() * getRadius() * height; // Volume = (1/3) * area of the base (circle) * height
    }

    // Method to display details of the Cone
    public void display() {
        System.out.println("Cone Details:");
        System.out.println("Radius: " + getRadius());
        System.out.println("Height: " + height);
        System.out.println("Color: " + getColor());
        System.out.println("Area of Base: " + getArea());
        System.out.println("Volume: " + getVolume());
    }

    
}
