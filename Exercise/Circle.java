public class Circle {
    // Private data fields
    private String color;
    private double radius;
    
    // Constructors
    // No-arg constructor (default values)
    public Circle() {
        this.color = "Red";
        this.radius = 1.0;
    }
    
    // Constructor with specified radius
    public Circle(double radius) {
        this.color = "Red";
        this.radius = radius;
    }
    
    // Constructor with specified radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getter for color
    public String getColor() {
        return color;
    }
    
    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    
}
