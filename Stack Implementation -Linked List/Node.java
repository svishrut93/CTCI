package stackwithlinkedlist;

public class Node {
	
	int data  ; 
	Node next ; 
	
	 public Node()
	    {
	        next = null;
	        data = 0;
	    }    
	    
	    public Node(int d,Node n)
	    {
	        data = d;
	        next = n;
	    }    

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
