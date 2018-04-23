package arrayManipulations;


public class TurningArray2D90degree 
{
	public static void main(String[] args) 
	{
		int [][] testArr2D = {{65,66,67,68,69,70,71},
				              {72,73,74,75,76,77,78},
				              {79,80,81,82,83,84,85},
				              {86,87,88,89,90,91,92},
				              {93,94,95,96,97,98,99}};
		
		printArray2D(testArr2D);              /*It will print:
		 
                                                 65,66,67,68,69,70,71
				                                 72,73,74,75,76,77,78
				                                 79,80,81,82,83,84,85
				                                 86,87,88,89,90,91,92
				                                 93,94,95,96,97,98,99
	                                          */

	 	
		
		System.out.println(); //Separator between before and after turning
		
		
		
		printArray2D(turnArray2D_90degree(testArr2D)); 
		
		                                       /*It will print: 
		                                        
                                                 71 78 85 92 99
                                                 70 77 84 91 98
                                                 69 76 83 90 97
                                                 68 75 82 89 96
                                                 67 74 81 88 95
                                                 66 73 80 87 94
                                                 65 72 79 86 93
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
	
	static int [][]turnArray2D_90degree (int arr2D[][])
	{
		
		int result[][] = new int [arr2D[0].length][arr2D.length];
		
		for (int i = 0; i < arr2D.length; i++)
		{
			for (int j = arr2D[i].length - 1, z = 0; z < result.length; j--, z++)
			{
				
				result[z][i] = arr2D[i][j];
				
			}
		}
		return result;
		
	}

}
