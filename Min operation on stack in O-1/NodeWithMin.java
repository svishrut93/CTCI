package questionthreepointtwo;


//Question 3.2

//How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element?
//Push, Pop and min should all operate in O (1) time.

public class NodeWithMin {
	
	int data  ; 
	NodeWithMin next ; 
	int min ; 
	
	
	 public NodeWithMin()
	    {
	        next = null;
	        data = 0;
	        
	    }    
	    
	 public NodeWithMin(int d,NodeWithMin n)
	    {
	        data = d;
	        next = n;
	    } 
	 
	 public NodeWithMin(int d , int min ) 
	 {
		 this.data= d; 
		 this.min = min ; 
		 this.next = null ; 
	 }
	 
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeWithMin getNext() {
		return next;
	}

	public void setNext(NodeWithMin next)
	{
		this.next = next;
	}
	
	public void SetMin(int min )
	{
		this.min = min ; 
	}
	
	public int GetMin()
	{
		return min ; 
	}

}
