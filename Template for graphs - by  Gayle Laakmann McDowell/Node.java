package Graphs;

public class Node {
	
	    private Node adjacent[];
	    public int adjacentCount;
	    private String vertex;
	   // public Question.State state;
	    
	    public Node(String vertex, int adjacentLength) 
	    //adjacent nodes: number of nodes around this node with connections to it 
	    {
	        this.vertex = vertex;                
	        adjacentCount = 0;        
	        adjacent = new Node[adjacentLength];
	    }
	    
	    public void addAdjacent(Node x)   //method to add a node adjacent to current node 
	    {
	    	
	        if (adjacentCount < 30)     //Any node cannot have more than 30 nodes adjacent to it 
	        {
	            this.adjacent[adjacentCount] = x;
	            adjacentCount++;
	        } 
	        
	        else 
	        {
	            System.out.print("No more adjacent can be added");
	        }
	        
	    }
	    
	    public Node[] getAdjacent()
	    {
	        return adjacent;
	    
	    }
	    public String getVertex()
	    {
	    
	    	return vertex;
	    }
	    
	    
	    
	    
	    
}
