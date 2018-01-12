package stackwithlinkedlist;

public class Stack {
	
	Node top; 
	int size; 
	
	
	public Stack()
	{
	     top = null ; 
	     size = 0 ; 
	     
	     System.out.println("Stack created  ");
	}
	
	public boolean isEmptY()			 				//Checking if stack is empty 
	{
		return top==null ; 
	}
	
	 public int getSize()
	 {
	        return size;
	 }   
	
	public void push(int data)                 			//Adding data to an empty stack  
	{
		Node newnode = new Node (data, null ); 
		
		if (top==null )
		{
			top = newnode ; 
		}
		else
		{
			newnode.setNext(top);
			top = newnode ; 
		}
		size++ ; 										//Adding to existing stack
		System.out.println("Pushed into stack : "+ data );
		
	}
	
	public void peek ()
	{
		System.out.println("Top of stack is : " + this.top.data);
	}
	
	public void pop ()							//Remove element from top of stack 
	{
		if (size == 0 )
		{
			System.out.println("Stack is empty. Nothing to remove ");
		}
		
		else 
		{
			Node pointer = top ; 
			top = top.getNext(); 
			size--; 
			System.out.println("Element popped is : "+pointer.getData());
			
		}
		
	}
	
	
	public void Size ()								//Return the number of elements in the linked list 
	{
		System.out.println("Number of elements in Linked list is "+ size);
	}
	
	
	public void display( )							//Display function after every operation 
	{
		Node pointer = top ; 
		
		while (pointer!= null )
		{
			System.out.print(pointer.getData()+ " ");
			pointer = pointer.getNext(); 
		}
		System.out.println();
	}
}
