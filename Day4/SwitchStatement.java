//Q6: Find the day of the Week using Switch control statement.
import java.util.Scanner;
class SwitchStatement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day of the week(1-7): ");
		int day = sc.nextInt();
		switch(day){
			case 1:
				System.out.println("Monday!");
				break;
			case 2:
				System.out.println("Tuesday!");
				break;
			case 3:
				System.out.println("Wednesday!");
				break;
			case 4:
				System.out.println("Thursday!");
				break;
			case 5:
				System.out.println("Friday!");
				break;
			case 6:
				System.out.println("Saturday!");
				break;
			case 7:
				System.out.println("Sunday!");
				break;
			default:
				System.out.println("Invalid day!");
		}
		System.out.println("Enter an alphabet: ");
		char alphabet = sc.next().charAt(0);
		switch(alphabet){
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println("It is a vowel!");
			default:
				System.out.println("It is a consonant!");
		}
	}
			//Q7: Check an alphabet is vowel or consonant using switch
			//Q8: Find the day of the Weekday or weekend Switch control statement.
			
}