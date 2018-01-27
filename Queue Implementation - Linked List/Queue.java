
public class Queue {
	
	
	Node head ; 
	Node tail;
	int size ; 
	
	public Queue()
	{
		head = null ;
		tail = null;
		size = 0 ; 
	}
	
	
	public void enqueue(int data )
	{
		
		Node n = new Node(data); 
		
		
		if(head == null )
		{
			head = n ; 
			tail =n ;
		}
		
		else
			
		{
			Node temp = head; 
			while(temp!=tail)
			{
				temp = temp.next;
			}
			tail.next = n ;
			tail = tail.next;
			 
		}
		size++; 
		
	}
	
	
	public void dequeue()
	{
		
		
		if(head != null )
		{
		System.out.println("Element removed is "+this.head.data);
		
		if(head == tail )
		{
		head = head.next; 
		tail = tail.next;
		}
		else
		{
			head = head.next; 
		}
		size--;
		}
		else
		{
			System.out.println("No elements to dequeue");
		}
		
	}
	
	public void getSize()
	{
		
		System.out.println("The size of queue is "+size );
		
	}
	
	
	public void getFront()
	{
		
		if(head==null)
		{
			System.out.println("Cannot get front as Queue is empty");
		}
		
		else
		{
		System.out.println("The front of queue element is : "+head.data);
		}
	}
	
	public void getBack()
	{
		if(tail==null)
		{
			System.out.println("Cannot get back as Queue is empty");
		}
		
		else
		{
		System.out.println("The back of queue element is : "+tail.data);
		}
	}
	
	public void display()
	{
		if (head == null )
		{
			System.out.println("Sorry the Queue is empty ");
		}
		else
		{
			Node temp = head ; 
			while(temp.next!= null )
			{
				System.out.print(temp.data+ "-->");
				temp = temp.next; 
			}
			System.out.print(temp.data);
			
		}
	}
}
