package questionthreepointtwo;

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
