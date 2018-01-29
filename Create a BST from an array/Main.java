package Q4point3;

import java.util.*; 

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in); 
		System.out.println("Enter the number of elements ");
		
		int number_of_elements = s.nextInt(); 
		int arr[] = new int[number_of_elements];
		
		
		System.out.println("Enter elements of the array ");
		
		for(int i = 0 ; i < number_of_elements ; i ++ )
		{
			arr[i] = s.nextInt(); 
		}
		
		 TreeNode ans = createMin(arr , 0 , arr.length-1 ); 
		 System.out.println(ans.data);
		 System.out.println(ans.left.data);
		 System.out.println(ans.right.data);
//		 System.out.println(ans.left.left.data);
//		 System.out.println(ans.left.right.data);
		 System.out.println("-------------------");
		 System.out.println("Pre order traversal of BST is");
		 display_preorder (ans);
		
	}
		
		public static void display_preorder(TreeNode ans)
		{
			System.out.println(ans.data);
			
			if(ans.left!=null)
			{
				display_preorder(ans.left );
			}
			
			if(ans.right!=null)
			{
				display_preorder(ans.right );
			}
			
		}

		public static TreeNode createMin (int arr[] , int start , int end )
		
		{
			if(start>end)
			{
				return null ; 
			}

				int mid = (start+end )/2 ; 
				TreeNode n = new TreeNode (arr[mid]);			//Create subtree with root at mid 
				n.left = createMin(arr , start , mid-1); 	//Recurse left subtree
				n.right =  createMin (arr ,mid+1, end  ); 	//Recurse right subtree
				
				return n ; 	
		}
}
