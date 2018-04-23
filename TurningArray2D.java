package arrayManipulations;


public class TurningArray2D 
{
	public static void main(String[] args) 
	{
		int [][] testArr2D = {{65,66,67,68,69,70,71},
				              {72,73,74,75,76,77,78},
				              {79,80,81,82,83,84,85},
				              {86,87,88,89,90,91,92},
				              {93,94,95,96,97,98,99}};
		
		printArray2D(testArr2D); /*It will print: 
                                                 65,66,67,68,69,70,71
				                                 72,73,74,75,76,77,78
				                                 79,80,81,82,83,84,85
				                                 86,87,88,89,90,91,92
				                                 93,94,95,96,97,98,99
	                             */

	 	
		
		System.out.println(); //Separator between before and after turning
		
		turnArray2D(testArr2D);
		
		printArray2D(testArr2D); /*It will print: 
                                                 99 98 97 96 95 94 93
                                                 92 91 90 89 88 87 86
                                                 79 80 81 82 83 84 85
                                                 78 77 76 75 74 73 72
                                                 71 70 69 68 67 66 65
                                 */
	}
	
	static void printArray2D(int arr2D[][])
	{	
		for (int a[] : arr2D)
		{
			String line = "";
			for (int b : a)
				line += b + " ";
			
			System.out.println(line.trim());
		}
	}
	
	static void turnArray2D (int arr2D[][])
	{
		int temp;	
		
		for (int i = 0, j = arr2D.length-1; i <= j ; i++, j--)
		{	
			for (int x = 0, y = arr2D[i].length - 1; !(i==j && x>y); x++,y--)
			{	
				temp = arr2D[i][x];
				
				arr2D[i][x] = arr2D[j][y];
				
				arr2D[j][y] = temp;				
			}			
		}
	}

}
