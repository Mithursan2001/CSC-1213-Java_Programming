class ArrayExample{
	public static void main(String args[]){
		//declare an array
		int firstArray[];
		
		//instantiate an array
		int[] secondArray= new int[5];
		
		//Assign values
		secondArray[1] = 10;
		secondArray[4] = 13;
		
		//print the array elements
		for(int i=0;i<secondArray.length; i++){
			System.out.println(secondArray[i]);
		}
		System.out.println("print array elements using foreach loop");
		//print array elements using foreach loop
		for(int element: secondArray){
			System.out.println(element);
		}
		
		//Declare and initialize a double type array name 
		//NUMBERS with size 3
		double NUMBERS[] = {12.5,5.6,89.0};
		
		//print array elements using foreach loop
		System.out.println("print array NUMBERS");
		for(double y: NUMBERS){
			System.out.println(y);
		}
		
		//print 2nd element of NUMBERS array.
		System.out.println("Second element: "+ NUMBERS[1]);
		
		//Q1: Marks = [55,70,80,76,88]
		//Create an array MARKS, assign values. 
		//Find the sum of marks in MARKS.
		int MARKS[]={55,70,80,76,88};
		int sum_MARKS = 0;
		for(int marks: MARKS){
			sum_MARKS += marks;
		}
		System.out.println("Total: "+ sum_MARKS);
		
		//Find the average of MARKS
		//average = total/array length
		double average_MARKS = sum_MARKS/MARKS.length;
		System.out.println("Average: "+ average_MARKS);
		System.out.println();
		//Store the vowels in array VOWELS. Print the array 
		//using for each loop
		char VOWELS[]={'a','e','i','o','u'};
		for(char vowel: VOWELS){
			System.out.println(vowel);
		}
		
		
		
	
	}
}