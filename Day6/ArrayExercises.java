class ArrayExercises{
	/* Q1: Create an array NUMBERS = [4,7,9,10,8,9]
	Copy the values of NUMBERS to another array POSITIVE_NUMBERS using = operator 
	Change the 2nd element of NUMBERS to 12
	Print the arrays NUMBERS and POSITIVE_NUMBERS
	*/	
	public static void main(String args[]){
		int NUMBERS[] = {4,7,9,10,8,9};
		int POSITIVE_NUMBERS[] = NUMBERS;
		
		System.out.println("----POSITIVE_NUMBERS array-------");
		for(int pos_num: POSITIVE_NUMBERS){
			System.out.print(pos_num+"\t");  //"\t" used for tab
		}
		
		NUMBERS[1] = 12;
		System.out.println("\n----NUMBERS array-------");
		for(int num: NUMBERS){
			System.out.print(num+"\t");  
		}
		System.out.println("\n----POSITIVE_NUMBERS array-------");
		for(int pos_num: POSITIVE_NUMBERS){
			System.out.print(pos_num+"\t");  
		}
		
		/* Q2:Use for loop to copy the array elements from 
	array AVERAGE = [95.4, 88, 56.7, 76.3] to another array CPY_AVG */
	
		double AVERAGE[] = {95.4, 88, 56.7, 76.3};
		double CPY_AVG[]= new double[AVERAGE.length];
		
		System.out.println("\n----CPY_AVG array-------");
		for(int i=0;i<AVERAGE.length;i++){
			CPY_AVG[i]=AVERAGE[i];
			System.out.print(CPY_AVG[i]+"\t"); 
		}
		
		/* Q3: Initlaize a 2D array TABLE with following values.
		[10	35	64	90]
		[-52	61	11	 ]
		[-42			 ]
		[56	-10	23	71] 		
		Copy the array TABLE to another array NEW_TABLE*/
		int TABLE[][] = {{10,35,64,90},{-52,61,11},{-42},{56,-10,23,71}};
		int NEW_TABLE[][] = new int[TABLE.length][];
		
		System.out.println("\n----NEW_TABLE array-------"); 
		for(int i=0; i<NEW_TABLE.length;i++){
			NEW_TABLE[i] = new int[TABLE[i].length];
			for(int j=0;j<NEW_TABLE[i].length;j++){
				NEW_TABLE[i][j] = TABLE[i][j];
				System.out.print(NEW_TABLE[i][j]+"\t"); 
			}
			System.out.println();
		}
		/* Q4 There are 2 matrices
		MATRIX_A = [[2,5,6][7,8,5]]
		MATRIX_B = [[0,4,2][1,6,3]]	
		The MATRIX_SUM gives the addition of MATRIX_A and MATRIX_B 
		Display MATRIX_SUM
		*/
		int MATRIX_A[][]={{2,5,6},{7,8,5}};
		int MATRIX_B[][]={{0,4,2},{1,6,3}};
		int MATRIX_SUM[][] = new int[2][3];
		
		System.out.println("\n----MATRIX_SUM array-------"); 
		for(int i=0;i<MATRIX_SUM.length;i++){
			for(int j=0;j<MATRIX_SUM[i].length;j++){
				MATRIX_SUM[i][j]= MATRIX_A[i][j]+MATRIX_B[i][j];
				System.out.print(MATRIX_SUM[i][j]+"\t"); 
			}
			System.out.println();
		}
		/* Q5 There are 2 matrices
			MATRIX_C = [[2,-3,6][2,0,4]]
			MATRIX_D = [[0,4][2,4][1,3]]	
			The MATRIX_MUL gives the multiplication of MATRIX_C and 
			MATRIX_D 
			Display MATRIX_MUL
			*/
		int MATRIX_C[][]={{2,-3,6},{2,0,4}};
		int MATRIX_D[][]={{0,4},{2,4},{1,3}};
		int r1=MATRIX_C.length;
		int c1=MATRIX_C[0].length;
		int r2=MATRIX_D.length;
		int c2=MATRIX_D[0].length;
		
		System.out.println("r1: "+r1);
		System.out.println("c1: "+c1);
		System.out.println("r2: "+r2);
		System.out.println("c1: "+c2);
		
		int MATRIX_MUL[][]=new int[r1][c2];
		for (int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<c1; k++){
					MATRIX_MUL[i][j] += MATRIX_C[i][k]*MATRIX_D[k][j];					
				}
				System.out.print(MATRIX_MUL[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}
}