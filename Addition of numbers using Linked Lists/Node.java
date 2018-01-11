package Questiontwopointfive;


//
//You have two numbers represented by a linked list where each node contains a single digit. 
//The digits are stored in reverse order, such that 1's digit is at the head of the list.
//Write a function that adds the two numbers and returns the sum as a linked list 
//

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
