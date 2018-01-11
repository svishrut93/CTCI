package Questiontwopointfive;
import java.util.Scanner; 

//
//You have two numbers represented by a linked list where each node contains a single digit. 
//The digits are stored in reverse order, such that 1's digit is at the head of the list.
//Write a function that adds the two numbers and returns the sum as a linked list 
//

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in); 
			
		LinkedList FirstNumber = new LinkedList(); 
		LinkedList SecondNumber = new LinkedList() ; 
		LinkedList Answer = new LinkedList(); 
		
		System.out.println("Enter the first number");
		int firstNumber = s.nextInt(); 
		
		System.out.println("Enter the second number");
		int secondNumber = s.nextInt(); 
		
		//Inserting the two numbers into their respective linked lists 
		while(firstNumber!=0 )
		{
			int t = firstNumber%10; 
			FirstNumber.add(t);
			firstNumber = firstNumber/10; 
		}
		
		while(secondNumber!=0 )
		{
			int t = secondNumber%10; 
			SecondNumber.add(t);
			secondNumber = secondNumber/10; 	
		}

		FirstNumber.display();
		SecondNumber.display(); 
		
		
		Node ptr1 = FirstNumber.head; 
		Node ptr2 = SecondNumber.head; 
		Node carry = new Node(0); 
		
		if(FirstNumber.listcount>SecondNumber.listcount)			//Pad 0s to second number
		{
			int digitdiff = FirstNumber.listcount-SecondNumber.listcount;
			for(int i = 0 ; i < digitdiff ; i ++)
			{
				SecondNumber.add(0);
			}
		}
		
		if(FirstNumber.listcount<SecondNumber.listcount)
		{
			int digitdiff = SecondNumber.listcount-FirstNumber.listcount;
			for(int i = 0 ; i < digitdiff ; i ++)
			{
				FirstNumber.add(0);
			}
		}		
		for(int i = 0 ; i < FirstNumber.listcount ; i ++ )
		{
			int temp = ptr1.data+ptr2.data+carry.data; 
			Answer.add(temp%10);
			if(temp>9)
			{	
				 carry.data = temp/10; 	
			}
			ptr1= ptr1.next; 
			ptr2 = ptr2.next; 	
			 
		}
		if(carry.data>0)
		{
			Answer.add(carry.data);
		}
		
		Answer.display();
		
	}
		
}
