package ctci;

import java.util.* ; 

//Write an algorithm such that if an element in an MxN matrix is 0, its entire 
//row and column are set to 0 

public class ChangeToZeros {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		
		int M ; 
		int N ; 
		
		System.out.println("Enter the size for the matrix ");
		M = s.nextInt();
		N = s.nextInt(); 
		
		int[][] input_matrix = new int [M][N]; 
		
		System.out.println("Enter the elements into the matrix ");
		for(int i = 0 ; i < M ; i ++)
		{
			for(int j = 0 ; j <N ; j ++ )
			{
				input_matrix[i][j] = s.nextInt();
			}
		}
		
		Display (input_matrix); 		

		changeZeroLogic(input_matrix); 
		
	}

	private static void changeZeroLogic(int[][] input_matrix) {
		
		//Using arrays DS to save row and column indices (by filling them with 1)
		int[] rows = new int [input_matrix.length] ; 
		int[] columns = new int [input_matrix[0].length]; 
		

		//Determining the indices when a "0" is found in the input_matrix		
		for(int i = 0 ; i <input_matrix.length; i ++ )
		{
			
			for(int j = 0 ; j <input_matrix[0].length; j ++ )
			{
				
				if(input_matrix[i][j]==0 )
				{
					
					rows[i]=1 ; 
					columns[j] = 1; 
				}
			}
		}
	
		//fixing columns to 0 by traversing array "holding" row indices.
		//holding = row array in outer loop
		for(int i  = 0 ; i < rows.length ; i ++ )
		{
			if(rows[i]==1)
			{
				for(int j = 0 ; j < input_matrix[0].length ; j ++)
				
					{
						input_matrix [i][j] = 0 ; 
					}
			}
		}
		
		//fixing rows to 0 by traversing array "holding" column indices
		//holding = column array in outer loop
		for(int i = 0 ; i < columns.length ; i ++ )
		{
			if(columns[i]==1)
			{
				for(int j = 0 ; j < input_matrix[0].length ; j ++)
				
					{
						input_matrix [j][i] = 0 ; 
					}
			}	
		}
		
		Display(input_matrix); 	
	}

	private static void Display(int[][] input_matrix)
	{
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Matrix is ");
		for(int i = 0 ; i < input_matrix.length ; i ++)
		{
			System.out.println();
			
			for(int j = 0 ; j <input_matrix[0].length; j ++ )
			{
				System.out.print(input_matrix[i][j]);
			}
		}
	}
}
