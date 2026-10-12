class ArrayExample{
	//Q1: Initilaize an array MARKS = {98,76,45,23,17}
	//Find the largest element of the array
	//Find the smallest elemnt of the array
	
	public static void main(String args[]){
		int MARKS[] = {98,76,45,23,17};
		//Assigning 1st element as smallest and largest
		int largest = MARKS[0];
		int smallest = MARKS[0];
		
		//looping through array to compare
		for(int mark:MARKS){
			if(mark > largest)
				largest = mark;
			if(mark < smallest)
				smallest = mark;
		}
		System.out.println("The largest element is: "+ largest);
		System.out.println("The smallest element is: "+ smallest);
		
		//Q2: Declare and instantiate a 2D array
		//arrayName = TABLE, array size=(3,4)
		
		int TABLE[][] = new int[3][4];
		
		/* Q3: Initlaize a 2D array TABLE2 with following values.
		[1	3	6	9]
		[-5	6	11	 ]
		[-4			 ]
		[5	-10	23	7] */
		
		int TABLE2[][]={
		{1,3,6,9}, 
		{-5,6,11},
		{4},
		{5,-10,23,7}};
		//Print the values in TABLE2 using foreach loop and for loop
		//forloop
		for(int i=0;i<TABLE2.length;i++){//accessing rows
			for(int j=0; j<TABLE2[i].length;j++){ //accessing colums
				System.out.println("The element at ["+i+"]["+j+"]: "+TABLE2[i][j]);
			}
			
		}
		//foreach loop
		for(int row[]: TABLE2){
			for(int col:row){
				System.out.println("The data is: "+ col);
			}
		}
	}
	
}