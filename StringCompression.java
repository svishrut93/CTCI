package ctci;

import java.util.*; 

//Implemwnt a method to perform basic string compression using the counts of repeated characters 
//For example string aabcccccaaa would beocme a2b1c5a3. If the compressed string would not become smaller 
//than the original string, your method should returnm the original string 

public class StringCompression {
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in); 
		System.out.println("Enter the string  ");
		String input = s.nextLine();
		String ans = Compression(input); 
		System.out.println("Modified String is "+ans );	
		
	}
	private static String Compression(String input) {
		//Array Method 
		int[] temp = new int [256];
		
		for(int i = 0 ; i < input.length(); i ++ )
		{
			int character = input.charAt(i); 
			temp[character]++; 
		}
		
		String ans = ""; 
		for(int i = 0 ; i < input.length(); i++ )
		{
			char character = input.charAt(i); 
			int character_no = (int)character; 
			ans = ans+character+ Integer.toString(temp[character_no]); 
			i = i + (temp[character_no])-1 ;		
		}
		
		if (ans.length()>input.length())
		{
			return input; 
		}
		return ans ;		
	}
}
