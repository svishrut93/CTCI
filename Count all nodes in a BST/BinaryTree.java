package Q11point3;

//cOUNT NUMBER OF NODES IN BT

public class BinaryTree {
	
	Node root;
    
  
    static int count = 0 ; 
    public static int nodeCount (Node node )
    {
    	if(node==null)
    		return 0 ; 
    	
//    	if(node.left==null && node.right==null )
//    	{
//    		count = count+1 ; 
//    	}
    	if(node.left!=null) 
    	{
    		count=count+1; 
    		nodeCount(node.left); 
    	}
    	
    	if(node.right!=null)
    	{
    		count=count+1; 
    		nodeCount(node.right);
    	}
    	
    	return count +1; 
    }
    
    
    public static void main(String args[]) 
    {
        // Let us construct the BST shown in the above figure
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
  
        System.out.println("No. of nodes in the tree is : "+ nodeCount(tree.root));
  
    }

}
