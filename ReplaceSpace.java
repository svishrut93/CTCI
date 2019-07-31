package ctci;

/**
*Write a method to replace all spaces in a string with '%20'. 
*You may assume that the string has sufficient space at the end of the string to hold additional
*characters
*/

import java.util.Scanner;
import java.util.*; 

public class ReplaceSpace {
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in); 
		System.out.println("Enter the string  ");
		String input = s.nextLine();
		String ans = SpaceReplace(input); 
		 
		System.out.println("Modified String is "+ans );
		
	}

	private static String SpaceReplace(String input) {
			
		//The logic here does not involve counting any spaces/other characters in advance
		String ans = "";

		for(int i = 0 ; i < input.length() ; i ++ )
		{
			//When character is not a " "(space), simply append character to ans	
			if(input.charAt(i)!= ' ') 
				ans= ans+input.charAt(i); 
			//When chaqracter is a " "(space), append "%20" to ans
			else 
				ans= ans+"%20";
		}
		return ans ; 

	}
	
}
