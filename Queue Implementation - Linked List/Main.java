
public class Main {

	public static void main(String[] args) {
		
		
		Queue one = new Queue(); 
		
		one.enqueue(50);
		one.enqueue(100);
		one.enqueue(150);
		one.enqueue(200);
		one.enqueue(250);
		
		
		one.getSize(); 
		one.display();
		one.dequeue();
		one.dequeue();
		one.display();
		
		one.getBack();
		one.getFront();
		
		one.dequeue();
		one.dequeue();
		one.dequeue();
		
		
		one.display();
		one.getFront();
		one.getBack();
		one.dequeue();
		one.enqueue(70000);
		one.display();
		
		
		
	}

	
	
	
	
}
