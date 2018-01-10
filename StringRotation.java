package ctci;

import java.util.Arrays;
import java.util.Scanner;

//Given 2 strings, check if they are a rotation of each other. 

public class StringRotation {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in); 
		System.out.println("Enter 1st string  ");
		String input1 = s.nextLine();
		System.out.println("Enter 2nd string  ");
		String input2 = s.nextLine();
		
		Boolean ans = RotationCheck(input1, input2 ); 
		if(ans==true)
		{
			System.out.println("String is a rotation  ");
		}
		else
			System.out.println("String is not a rotation  ");	
	}

	private static Boolean RotationCheck(String input1,String input2 ) 
	{
		if(input1.length()!=input2.length())
		{
			return false; 
		}
		
		String concat = input1+input1 ; 
		
		//return isSubstring(concat,input2);
		
		return concat.contains(input2);
		
		

	}
}
