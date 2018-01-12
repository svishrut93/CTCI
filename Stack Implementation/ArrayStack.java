package BasicStack;
import java.util.*; 


public class ArrayStack {
	
	int size; 
	int top; 
	int length ; 
	int[] stackStorage; 
	
	
	public ArrayStack ( int n )
	{
		this.size = n ; 
		this.length = 0 ; 
		this.top  =-1 ; 
		
		
		stackStorage = new int[size]; 
	}
	
	//Checking if the stack is empty 
	
	public boolean isEmpty( )
	{
		return top == -1 ; 
	}
	
	//Checking if stack is full 
	
	public boolean isFull()
	{
		return top == size-1 ; 
	}
	
	public int peek ()
	{
		if(this.isEmpty())
		{
            throw new NoSuchElementException("Underflow ");

		}
		return stackStorage[top]; 
	}
	
	//Pushing element into Stack 
	
	public void push (int data )
	{
		
		if(top+1 >=size)
		{
			throw new IndexOutOfBoundsException("Overflow: Stack is full  ");
		}
		
		else
		{
			top++ ;
			//System.out.println(top);
			stackStorage[top] = data ; 
			length ++ ; 
			System.out.println("Element added ");
		}
	}
	
	//Popping element out of stack 
	
	public int pop (  )
	{
		if(isEmpty())
		{
            throw new NoSuchElementException("Underflow : No element in stack to pop");

		}
		else
		{
			length--; 
			System.out.println("Element Popped ");
			return stackStorage[top--];
		
		}
	}
		
		public void  display()
		{
			 System.out.print("\nStack = ");
		        if (length == 0)
		        {
		            System.out.print("Empty\n");
		            return ;
		        }
		        for (int i = top; i >= 0; i--)
		            System.out.print(stackStorage[i]+" ");
		        System.out.println();
		}	
}
