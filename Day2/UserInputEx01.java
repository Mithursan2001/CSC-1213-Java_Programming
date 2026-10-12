import java.util.Scanner;

class UserInputEx01{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your age:");
		int age =sc.nextInt();
		//sc.nextLine();
		System.out.println("Enter your registration number:");
		String regNo=sc.next();
		//print the values we have read.
		System.out.println("Name:"+name+"\nRegistration Number:"+regNo+"\nAge:"+age);
	}
}