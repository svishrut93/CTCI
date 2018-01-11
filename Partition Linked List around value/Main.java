package Questiontwopointthree;
import java.util.Scanner; 


//Write code to partition a linked list aroubnd a vbalue x such that all nodes less than x come
//before all nodes greater than  or equal to x 


public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in); 
		LinkedList FullList = new LinkedList () ; 
		
		//Adding by data 
		FullList.add(45);
		FullList.add(25);
		FullList.add(15);
		FullList.add(65);
		FullList.add(95);
		FullList.add(105);
		FullList.add(10);
		FullList.add(5);
		FullList.add(90);
		FullList.add(100);
		FullList.add(21); 
		FullList.add(120);
		FullList.add(12);
		FullList.add(30);
		FullList.add(150);
		FullList.display(); 
		
		System.out.println("Enter the value around which you want to partition  ");
		
		int value = s.nextInt(); 
		
		//Create two new linked lists 
		LinkedList Lesser = new LinkedList(); 
		
		
		LinkedList Greater = new LinkedList () ; 
		LinkedList Combined = new LinkedList(); 
		
		Node ptr1 = FullList.head;

		
		for(int i = 0 ; i < FullList.listcount ; i ++ )
		{
			if(ptr1.data<value )
			{
				//Add into lesser list 
				Lesser.add(ptr1.data);
					
			}
			else 
			{
				//Add into greater list 
				Greater.add(ptr1.data);
			}
			
			if(ptr1.next!=null)
			ptr1= ptr1.next; 
		}
		
		System.out.println("Linked List containing all lesser elements ");
		Lesser.display();
		System.out.println("Linked List containing all Greater elements ");
		Greater.display();
		
		System.out.println(ptr1.data+ "Last element of ptr ");
		
		Node Lesserpointer = Lesser.head;
		
		for(int i = 0 ; i < Lesser.listcount ; i ++ )
		{
			if(Lesserpointer.getNext()!=null)
			{
				
				Lesserpointer = Lesserpointer.getNext(); 
			}
			
		}
		Lesserpointer.setNext(Greater.head);
		
		System.out.println("Combined Linked List ");
		Lesser.display();	
		
	}
		
}
