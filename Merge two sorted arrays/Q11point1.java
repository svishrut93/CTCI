//
//
//You are given two sorted arrays A and B where A has large enough buffer at the end to hold B. 
//Write a method to merge B into A in a sorted order 


import java.util.Scanner ; 

public class Q11point1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in ) ; 
		
		int arr1[] = new int[10] ; 
		int arr2 [] = new int [5]; 
		
		System.out.println("Enter the elements if array 1 ");
		for(int i = 0 ; i < 5 ; i ++ )
		{
			arr1[i]= s.nextInt(); 
		}
		
		System.out.println("Enter the elements of array 2 ");
		for(int i = 0 ; i < 5 ; i ++ )
		{
			arr2[i]= s.nextInt(); 
		}
		
		merge(arr1,arr2); 
		
		display(arr1); 
		
		
	}

	private static void display(int[] arr1)
	{
		// TODO Auto-generated method stub
		
		System.out.println("The mereged array is ....");
		for(int i = 0 ; i < arr1.length ; i ++ )
		{
			System.out.print(arr1[i]);
		}
	}

	public static void merge(int[] arr1, int[] arr2)
	
	{
		int last_arr2 = arr2.length-1 ; 
		int last_arr1 = arr2.length-1 ; 
		
		int merger = arr1.length-1 ; 
		
		
		System.out.println(last_arr1+"   "+last_arr2+" "+ merger);
		
		while (last_arr2>=0  )
		{
			
			if(last_arr1 > 0 && arr1[last_arr1]>arr2[last_arr2])
			{
				arr1[merger] = arr1[last_arr1]; 
				last_arr1-- ; 
				
				
			}
			
			else 
			{
				arr1[merger] = arr2[last_arr2];
				last_arr2--;  
				
			}
			merger-- ; 
				
		}
	}

}
