import java.util.Scanner;

class UserInput{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		//Int input
		System.out.println("Enter an integer value: ");
		int val1 = sc.nextInt();
		
		//double input
		System.out.println("Enter a double value: ");
		double val2 = sc.nextDouble();
		
		//String input
		System.out.println("Enter a String value: ");
		String val3 = sc.nextLine();
		
		//String input
		System.out.println("Enter another String value: ");
		String val4 = sc.next();
		
		//char input
		System.out.println("Enter a char value: ");
		char val5 = sc.next().charAt(0);

		

	}
}