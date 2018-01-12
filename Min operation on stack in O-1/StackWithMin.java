package questionthreepointtwo;



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
