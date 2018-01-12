package BasicStack; 
import java.util.Scanner ; 

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in); 
		
		System.out.println("Enter Size of Stack ");
		int n = s.nextInt(); 
		
		ArrayStack Memory = new ArrayStack (n); 
		
		if(Memory.isEmpty())
		{
			System.out.println("Stack is empty ");
		}
		
		
		Memory.push(5);
		Memory.push(10);
		Memory.push(15);
		Memory.push(20);
		Memory.push(25);
		Memory.push(30);
		Memory.push(35);
		Memory.push(40); 
		
		Memory.pop();
		Memory.pop(); 
		
		Memory.peek(); 
		
		Memory.display(); 
		
		
		
				
		
	}

}
