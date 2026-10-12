class Example{
	public static void main(String args[]){
		//find the ascii value of a character
		char c1 = 'g';
		System.out.println("The character is:" + c1);
		
		//changing the char into int
		int int1 = (int)c1;
		System.out.println("The character is:" + int1);
		
		//changing a double into int
		double d1 = 10.09;
		System.out.println("The value is:" + d1);
		
		int int2 = (int)d1;
		System.out.println("The value is:" + int2);
		
		double d2 = int1;
		System.out.println("The d2 value is:" + d2);
	}
}