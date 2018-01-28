
public class Tree {

	TreeNode root = null ; 
	int nodecount = 0; 
	
	
	public Tree (int data )
	{
		TreeNode new_node = new TreeNode(data);
		this.root = new_node; 
		nodecount++ ; 
		
	}
	
	public void add(TreeNode parent , TreeNode child , String orientation )
	{
	
		if (orientation.equals("left"))
	        {
	           parent.setLeft(child);
	        }
	        else
	        {
	            parent.setRight(child);
	        }
	}
	
	
	
	
	
	
	
	
}
