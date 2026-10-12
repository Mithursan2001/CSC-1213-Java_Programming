import java.util.Scanner;

public class bmi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightPounds = s.nextDouble();

        // Prompt user to enter height in inches
        System.out.print("Enter height in inches: ");
        double heightInches = s.nextDouble();

        // Convert height from inches to meters (1 inch = 0.0254 meters)
        double heightMeters = heightInches * 0.0254;

        // Convert weight from pounds to kilograms (1 pound = 0.453592 kilograms)
        double weightKg = weightPounds * 0.453592;

        // Calculate BMI (BMI = weight in kg / (height in meters * height in meters))
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display the BMI
        System.out.println("BMI is: " + bmi);

        
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi<25)
		{
			System.out.println("Normal");
		}
		else if(bmi<30)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obesity");
		}
    }
	
}
