package ctci;

import java.util.Scanner;
import java.util.*; 

//Given two strings decide if one string is the permutation of the other 

public class Anagram {

	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in); 
		System.out.println("Enter the first string  ");
		String input1 = s.nextLine();
		System.out.println("Enter the second string ");
		String input2 = s.nextLine(); 
		
		Boolean b = AnagramChecker(input1, input2 );
		
		if(b==true)
		{
			System.out.println("Two Strings are anagrams  ");
		}
		else
			System.out.println("Given Strings are not anagrams ");
	
	}

	private static Boolean AnagramChecker(String input1, String input2) 
	{
		char[] input1_array = input1.toCharArray(); 
		char[] input2_array = input2.toCharArray(); 
	
		
		if(input1.length()!=input2.length())
		{
			return false ; 
		}	
		
		Arrays.sort(input1_array);
		Arrays.sort(input2_array);
		
		
		String a = Arrays.toString(input1_array);
		String b  = Arrays.toString(input2_array); 
		
		
		System.out.println(a);
		System.out.println(b); 
		
		
		
		
		return a.equals(b); 	
		
	}
	

}
