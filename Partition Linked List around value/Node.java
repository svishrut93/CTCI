package Questiontwopointthree;


//Write code to partition a linked list aroubnd a vbalue x such that all nodes less than x come
//before all nodes greater than  or equal to x 

public class Node {
	
	int data  ; 
	Node next ; 
	
	public  Node (int data )
	{
		this.data = data ; 
		this.next = null ; 
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
