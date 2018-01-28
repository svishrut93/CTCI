
public class Main {
	
	
	public static void main(String[] args) 

	{
		
		  TreeNode n1 = new TreeNode(40);
		  TreeNode n2 = new TreeNode(80);
		  TreeNode n3 = new TreeNode(65);
		  TreeNode n4 = new TreeNode(90);
		 
		  TreeNode n5 = new TreeNode(120); 
		  TreeNode n6 = new TreeNode(150);
		  
		  
		  
		  Tree one = new Tree(25); 
		  
		  
		  one.add(one.root, n1, "left");
		  one.add(one.root, n2, "right");
		  one.add(n1, n3, "left");
		  one.add(n1, n4, "right");
		  one.add(n2, n5, "left");
		  one.add(n2, n6, "right"); 
		
		  System.out.println("Inorder traversal of Binary tree ");
		  display_inorder(one.root); 
		  
		  
		  System.out.println("BFS traversal of the tree ");
		  bfs(one.root); 
		  
		  
		  System.out.println("DFS traversal of the tree: Preorder  ");
		  dfs(one.root);
		  
		   
	}
	
	public  static void dfs(TreeNode bt) 
	{
		System.out.println( bt.data );
		
		if( bt.left != null ) 
		{
			display_inorder(bt.left);
		}
		
		
		
		if( bt.right != null ) 
		{
			
		    display_inorder(bt.right);
		}	
	}

	public static void bfs(TreeNode root )
	{
		System.out.println("-------------------------");
		Queue store = new Queue(); 
		TreeNode temp = root; 
		
		while(temp.right!= null && temp.left!= null )
		{
			System.out.println(temp.data);
			store.enqueue(temp.left);
			store.enqueue(temp.right); 
			TreeNode removed_from_Queue = store.dequeue();
			temp = removed_from_Queue ; 
			
		}
		System.out.println(temp.data);
		
		while (store.size!=0 )
		{
			System.out.println(store.head.data);
			store.dequeue(); 
			
		}
		
	}

	public static void display_inorder(TreeNode bt )
	{		
				if( bt.left != null ) 
				{
					display_inorder(bt.left);
				}
				
				System.out.println( bt.data );
				
				if( bt.right != null ) 
				{
					
				    display_inorder(bt.right);
				}	
	}
}
