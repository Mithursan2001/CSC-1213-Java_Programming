import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius of the cylinder
        System.out.print("Enter radius of cylinder: ");
        double radius = input.nextDouble();

        // Prompt the user to enter the length of the cylinder
        System.out.print("Enter length of cylinder: ");
        double length = input.nextDouble();

        // Define the value of pi
        final double PI = 3.14159;

        // Compute the area of the cylinder base
        double area = PI * radius * radius;

        // Compute the volume of the cylinder
        double volume = area * length;

        // Display the area and volume
        System.out.printf("Area of cylinder: ", area);
        System.out.printf("Volume of cylinder: ", volume);

        
    }
}