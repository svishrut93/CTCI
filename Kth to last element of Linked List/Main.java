package Questiontwopointtwo;
import java.util.Scanner; 


//Implement an algorithm to find the kth to last element of a singly linked list 
//itertive method 


public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in); 
		LinkedList q2 = new LinkedList () ; 
		
		//Adding by data 
		q2.add(10);
		q2.add(20);
		q2.add(30);
		q2.add(40);
		q2.add(50);
		q2.add(60);
		q2.add(70);
		q2.add(80);
		q2.add(90);
		q2.add(100);
		q2.add(110); 
		q2.add(120);
		q2.add(130);
		q2.add(140);
		q2.add(150);
		q2.display(); 
		
		System.out.println("Enter the value for k ");
		int kth = s.nextInt(); 
		
		if (kth>q2.listcount)
		{
			System.out.println("Invalid value for k.");
		}
		
		else
		{
			Node pointer1 = q2.head; 
			Node pointer2 = q2.head; 
			
			//Place pointer1 k nodes ahead of pointer2
			
			for(int i = 0 ; i < kth-1 ; i ++ )
			{
				pointer2 = pointer2.getNext(); 
			}
			
			while(pointer2.getNext()!=null)
			{
				pointer2=pointer2.getNext(); 
				pointer1 = pointer1.getNext(); 
			}
			
			System.out.println("The value of " + kth+"th"+  "last element in Linkedlist is "+ pointer1.getData());
		}	
	}
		
}
