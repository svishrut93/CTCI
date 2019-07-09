package chapter2;

public class LinkedList {
	
	Node head ; 
	int listcount ; 
	
	
	public LinkedList()
	{
	     head = null ; 
	     listcount = 0 ; 
	     
	     System.out.println("Linked List created  ");
	}
	
	public void add(int data)                 			//Adding data to an empty linked list 
	{
		if(head == null)
		{
			Node adder  = new Node(data); 
			this.head = adder ; 
			listcount++ ; 
			System.out.println("Element added ");
		}
		
		else                                  			//Adding to the end of a linked list 
		{
			Node current = this.head; 
			Node adder = new Node (data) ; 
			while(current.getNext()!= null)
			{
				current = current.getNext(); 
			}
			current.setNext(adder); 
			listcount++; 
			System.out.println("Element added ");
			
		}
	}
	
	
	public void add(int data, int position )   				//Adding to a particular position on the linked list 
	{
		
		if(position==0 || position> this.listcount)
		{
			System.out.println("Invalid Position specified. Please change ");
			
		}
		else
		{	
		
		int place  = 0 ; 
		Node adder = new Node (data) ;
		Node current = this.head; 
		
		if(position == 1 )
		{
			current = current.getNext(); 
			this.head = adder; 
			adder.setNext(current);
		}
		
		else
			{
				while (place != (position - 2) )
				{
					current = current.getNext(); 
					place++ ; 
				}
		
				adder.setNext(current.getNext()); 
				current.setNext(adder);
				listcount++ ; 
				System.out.println("Added " + data + " at position "+ position );
			}	
		}
	}
	
	public void remove (int data )							//Removing  specified element from the linked list 
	{
		if (this.listcount==0)
		{
			System.out.println("Sorry! ,Cannot remove.  The linked list is already empty");
		}
		
		Node current = this.head; 
		
		if(current.data == data)
		{
			head = current.getNext(); 
			listcount--; 
		}
		
		else
		{
		
			while ( current.getNext()!=null  && current.getNext().data!= data  )
			{
				current = current.getNext(); 
				
			}
			
			if(current.getNext()==null)
			{
				System.out.println("Element to remove is not part of the linked list . ");		
			}
			else
			{	
				current.setNext(current.getNext().getNext()); 
				listcount--; 
				System.out.println("Element "+ data + " is now deleted from linked list ");
			}
		}
	}
	
	
	public void removefromposition (int position )   		//Removing from specified position in  linked list 
	{
		if (position>this.listcount || position == 0 )
		{
			System.out.println("Error in position specified.. Please change it.  ");
		}
		
		else if (position == 1)
		{
			Node current = this.head; 
			this.head = current.getNext(); 
			listcount--; 
			System.out.println("Element at position  "+ position  + " is now deleted from linked list ");
		}
		
		
		else
		{
			int post = 0 ; 
			Node current = this.head; 
			while (post != position-2)
			{
				current = current.getNext(); 
				post++; 
			}
			
			current.setNext(current.getNext().getNext()); 
			listcount--; 
			System.out.println("Element at position  "+ position  + " is now deleted from linked list ");
					
		}
	}
	
	public void Size ()								//Return the number of elements in the linked list 
	{
		System.out.println("Number of elements in Linked list is "+ this.listcount);
	}
	
	
	public void display( )							//Display function after every operation 
	{
		
		if(this.listcount==0)
		{
			System.out.println("Linked list is empty, nothing to display ");
			
		}
		else
		{
			Node current = this.head; 
			while(current.getNext()!= null )
			{
				System.out.println(current.data);
				current = current.getNext(); 
			}
			System.out.println(current.data);
			System.out.println("End of Linked List ");
		}
	}

}
