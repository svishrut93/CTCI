package ctci;

import java.util.*;

//Implement an algorithm to determine if a string has all unique characters 

public class UniqueCharacters {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in); 
		System.out.println("Enter the string you want to check for ");
		String input = s.nextLine();
		Boolean b = checkunique(input); 
		
		if(b==true)
		{
			System.out.println("The String entered has all unique characters ");
		}
		else
			System.out.println("The String contains duplicate characters ");
		
	}

	private static Boolean checkunique(String input)
	{
		
		if(input.length()>256)
		{
			return false ; 
		}
		
		int [] checker = new int[256];
		
		for(int i = 0 ; i < input.length() ; i ++ )
		{
			int temp = input.charAt(i); 
			
			if(checker[temp]==0)
			{
				checker[temp]++;
			}
			else
			{
				return false;
			}			
		}
		return true; 
		
	}
}
