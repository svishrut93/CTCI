package Q4point2;


import java.util.*; 

public class Main {
	
	public enum State {
		
		Unvisited, Visited, Visiting;
	} 
	
	public static void main(String args[])
	{
		Graph g = createNewGraph();   //Create graph by passing label for a node, and the number of adjacent nodes to it 
		System.out.println("Graph created ");
		Node[] n = g.getNodes();
		
//		System.out.println("Node array : ");
//		for(int i =0; i < n.length ; i ++ )
//		{
//			System.out.println(n[i]);
//		}
		
		Node start = n[3];
		Node end = n[5];
		boolean ans = search(g , start , end ); 
		
		
		if(ans == true )
		{
			System.out.println("A path exists between the two nodes ");
		}
		
		else
		{
			System.out.println("Path does not exist between the two nodes ");
		}
	}
	
	
	public static boolean search (Graph g , Node start , Node end )
	{
		
		 LinkedList<Node> q = new LinkedList<Node>();
	        for (Node u : g.getNodes()) {
	            u.state = State.Unvisited;
	        }
	        start.state = State.Visiting;
	        q.add(start);
	        Node u;
	        while(!q.isEmpty()) {
	            u = q.removeFirst();
	            if (u != null) {
		            for (Node v : u.getAdjacent()) {
		                if (v.state == State.Unvisited) {
		                    if (v == end) {
		                        return true;
		                    } else {
		                        v.state = State.Visiting;
		                        q.add(v);
		                    }
		                }
		            }
		            u.state = State.Visited;
	            }
	        }
	        return false;
	    }
		
		

	
	public static Graph createNewGraph()
	{
		Graph g = new Graph();        
		Node[] temp = new Node[6];

		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);

		temp[0].addAdjacent(temp[1]); //adding node 1 adjacent to node 0 
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
				
		for (int i = 0; i < 6; i++) 
		{
			g.addNode(temp[i]);
		}
		return g;
	}

}
