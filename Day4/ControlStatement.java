import java.util.Scanner;
class ControlStatement{
	//Using if print whether a userinput is positive or negative
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		
		//using if to decide
		if(num < 0){
			System.out.println(num+" is a negative integer");
		}
		else if(num > 0){
			System.out.println(num+" is a positive integer");
		}
		else{
			System.out.println("It is zero");
		}
		
		//Q2: Check a number is odd or even using if--else
		if(num%2==0){
			System.out.println(num+" is an even number");
		}
		else{
			System.out.println(num+" is an odd number");
		}
		
		//Q3: Check an alphabet is vowel or consonant using single if-else
		System.out.println(" Enter an alphabet: ");
		char alphabet = sc.next().charAt(0);
		
		if(alphabet=='a' || alphabet=='A' || alphabet =='e' || alphabet=='E'|| alphabet =='i' || alphabet=='I'|| alphabet =='o' || alphabet=='O'|| alphabet =='u' || alphabet=='U'){
			System.out.println(alphabet+" is a vowel");
		}
		else{
			System.out.println(alphabet+" is a consonant");
		}
	}
}

/*Q4: Following program determine the grade based on the score 
obtained by student.
Score	Grade
90-100	A 
80-89	B 
70-79	C 
50-69	D 
0-49	E 
 */
//Q5: Get 3 numbers as user input, and find the largest value among them.	

