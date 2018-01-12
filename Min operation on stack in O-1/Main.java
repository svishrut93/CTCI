package questionthreepointtwo;

//Question 3.2

//How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element?
//Push, Pop and min should all operate in O (1) time.

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
		
		
	}
		
}
