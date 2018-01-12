package questionthreepointtwo;

public class Main {

	public static void main(String[] args) {
		
		StackWithMin ss = new StackWithMin () ; 
		int stackmin; 
		
		//Adding by data 
		ss.push(10);
		stackmin = ss.min();
		System.out.println("Minimum elemnt is : "+ stackmin);
		
		ss.push(20);
		stackmin = ss.min();
		System.out.println("Minimum elemnt is : "+ stackmin);
		
		stackmin = ss.min();
		System.out.println("Minimum elemnt is : "+ stackmin);
		ss.push(8);
		stackmin = ss.min();
		System.out.println("Minimum elemnt is : "+ stackmin);
		ss.push(40);
		stackmin = ss.min();
		System.out.println("Minimum elemnt is : "+ stackmin);
		ss.push(5);
		
		ss.peek();
		
		
		ss.pop(); 
		stackmin = ss.min();
		System.out.println("Minimum elemnt is : "+ stackmin);
		ss.pop();
		stackmin = ss.min();
		System.out.println("Minimum elemnt is : "+ stackmin);
		
		
		
		System.out.println("Elements is stack are : ");
		ss.display();
		
		
		//First.display(); 
		
		
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
//		First.add(100, 1);
//		First.display();
//		First.add(200,3);
//		First.display();
//		First.add(300,5);
//		First.display();
//		First.add(0,1000);
//		First.add(1000,0);
		
	}
		
}
