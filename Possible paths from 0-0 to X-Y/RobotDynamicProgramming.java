package ninepointtwo;
import java.util.Scanner ; 


/**
 * 
 * 9.2 Imagine a robot sitting on the upper left comer of an X by Y grid. The robot can only move in two directions: right and down. 
 * How many possible paths are there for the robot to go from (0, 0) to (X, Y) ?
 **/

public class RobotDynamicProgramming {
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in); 
		
		System.out.println("Input number of rows of grid ");
		int row = s.nextInt(); 
		System.out.println("Input number of columns of grid ");
		int column = s.nextInt(); 
		
		int ans = Robotpaths(row, column ); 
		
		System.out.println("Number of ways tgo reach the last cell of grid = "  +ans);
		
		
	}

	private static int Robotpaths(int row, int column) {
		// TODO Auto-generated method stub
		
		int[][] grid = new int [row][column] ;
		
		for(int i = 0 ; i < row ; i ++ )
		{
			grid[i][0] = 1 ; 
			
		}
		
		for(int i = 0 ; i < column  ; i ++)
		{
			grid[0][i] = 1 ; 
		}	
		for(int i = 1 ; i < row ;  i++ )
		{
			for(int j = 1 ; j < column ; j ++ )
			{
				 grid[i][j] = grid [i-1][j]+ grid[i][j-1]; 
			}
		}

		return grid[row-1][column-1];
	}
	
}
