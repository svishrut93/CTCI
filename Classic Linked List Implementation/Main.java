package chapter2;

public class Main {

	public static void main(String[] args) {
		
		LinkedList First = new LinkedList () ; 
		
		//Adding by data 
		First.add(10);
		First.add(20);
		First.add(30);
		First.add(40);
		First.add(50);
		First.display(); 
		
		
		//Remove elements : all  test cases 
//		First.remove(10);
//		First.display();
//		First.remove(20);
//		First.display();
//		First.remove(30);
//		First.display();
//		First.remove(40);
//		First.remove(888);
//		First.display();
//		First.remove(50);
//		First.display();
//		First.Size();
		
		//Remove by position : all test cases 
//		First.removefromposition(0);
//		First.removefromposition(155);
//		First.removefromposition(1);
//		First.display();
//		First.removefromposition(2);
//		First.display();
//		First.removefromposition(3);
//		First.display();
//		First.removefromposition(4);
//		First.display();
//		First.removefromposition(5);
//		First.display(); 
		
	
		//Test cases for different add positions : 
		First.add(100, 1);
		First.display();
		First.add(200,3);
		First.display();
		First.add(300,5);
		First.display();
		First.add(0,1000);
		First.add(1000,0);
		
	}
		
}
