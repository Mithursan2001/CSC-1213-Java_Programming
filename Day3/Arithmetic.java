import java.util.Scanner;

class Arithmetic{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		/* //initialize 2 variables a,b
		int a = 10;
		int b = 3;
		//add
		System.out.println("a + b :"+ (a+b));
		//sub
		System.out.println("a - b :"+ (a-b));
		//mul
		System.out.println("a * b :"+ (a*b));
		//div
		System.out.println("a / b :"+ (a/b));
		//mod
		System.out.println("a % b :"+ (a%b));
	 */
	 
	 /* System.out.println("Enter a value for var1 :");
	 int var1 = sc.nextInt(); //input 2
	 int var2;
	 
	 //Assign value var1=var2 ---->var2=2
	 var2 = var1;
	 System.out.println("var2 = "+var2);
	  
	 //+= --> var1 = var1+4   --->var1=2+4=6
	 var1+=4;
	 System.out.println("var1 = "+var1);
	 
	 //-=  var1 = var1-3   ----> var1 = 6-3 = 3
	 var1-=3;
	 System.out.println("var1 = "+var1);
	 
	 //*=
	 var2*=3;
	 System.out.println("var2 = "+var2);
	 
	 // /=
	 var2/=2;
	 var1 = var1+4
	 
	 //%=
	 var1%=2;
	 System.out.println("var1 = "+var1); */
	 
	 
	 int x = 10;
	 int y = 20;
	 
	 System.out.println("x == y :"+ (x == y));
	 System.out.println("x != y :"+ (x != y));
	 System.out.println("x > y :"+ (x > y));
	 System.out.println("x < y :"+ (x < y));
	 System.out.println("x >= y :"+ (x >= y));
	 System.out.println("x <= y :"+ (x <= y));
	 
	 
	 System.out.println("(x == y)&& (x < y) :"+ ((x == y)&& (x < y)));
	 System.out.println("(x != y)&& (x < y) :"+ ((x != y)&& (x < y)));
	 System.out.println("(x <= y)|| (x != y) :"+ ((x <= y)|| (x != y)));
	 System.out.println("!(x != y)&& (x > y) :"+ (!(x != y)&& (x > y)));
	 
	 //Q1: Divide a user input int by 3 and find the quotient and reminder
	 //Q2: Swap two number values: e.g. x=5 and y=7  ----> x = 7 and y=5

	}
}