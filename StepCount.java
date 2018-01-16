package ninepointone;
import java.util.Scanner ; 

//9.1 A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at 
//a time. Implement a method to count how many possible ways the child can run up the stairs.


//recursive solution
public class StepCount {
	
	public static void main(String[] args) {
		
	Scanner s = new Scanner (System.in); 
		
		System.out.println("Input number of stairs ");
		int stairs = s.nextInt(); 
		
		
		int ans = Calculateways(stairs); 
		System.out.println(ans);
	
	}

	private static int Calculateways(int stairs) {
		// TODO Auto-generated method stub
		
		if(stairs < 0)
		{
			return 0;
		}
		else if (stairs == 0)
			return 1;
		else
		{
			return Calculateways(stairs - 1) + Calculateways(stairs - 2)
					+ Calculateways(stairs - 3);
		
		}
		
	}
}

	
