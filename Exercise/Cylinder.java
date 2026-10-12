public class Cylinder extends Circle {
    // Private data field specific to Cylinder
    private double height;

    // Constructors
    // No-arg constructor (default values)
    public Cylinder() {
        super(); // Calls the no-arg constructor of Circle (default Circle with radius 1.0 and color "Red")
        this.height = 1.0;
    }

    // Constructor with specified radius
    public Cylinder(double radius) {
        super(radius); // Calls the constructor of Circle with specified radius and default color "Red"
        this.height = 1.0;
    }

    // Constructor with specified radius and height
    public Cylinder(double radius, double height) {
        super(radius); // Calls the constructor of Circle with specified radius and default color "Red"
        this.height = height;
    }

    // Constructor with specified radius, height, and color
    public Cylinder(double radius, double height, String color) {
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

    // Method to calculate the volume of the cylinder
    public double getVolume() {
        return getArea() * height; // Volume = area of the base (circle) * height
    }

    // Method to display details of the Cylinder
    public void display() {
        System.out.println("Cylinder Details:");
        System.out.println("Radius: " + getRadius());
        System.out.println("Height: " + height);
        System.out.println("Color: " + getColor());
        System.out.println("Area of Base: " + getArea());
        System.out.println("Volume: " + getVolume());
    }

    
}
