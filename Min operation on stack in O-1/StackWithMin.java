package questionthreepointtwo;

//Question 3.2

//How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element?
//Push, Pop and min should all operate in O (1) time.

public class StackWithMin extends Stack {
	
	public void push(int data)
	{
		int newMin = Math.min(data, min());
		super.push (data,newMin);
	}

	public int min() 
	{
		// TODO Auto-generated method stub
		if(this.isEmptY())
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return peeker();
		}
	}
	

}
