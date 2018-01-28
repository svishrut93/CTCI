package Graphs;

public class Main {
	
	public static void main(String a[])
	{
		Graph g = createNewGraph();   //Create graph by passing label for a node, and the number of adjacent nodes to it 
		System.out.println("Graph created ");
		Node[] n = g.getNodes();
		
		System.out.println("Node array : ");
		for(int i =0; i < n.length ; i ++ )
		{
			System.out.println(n[i]);
		}
		
		//Node start = n[3];
		//Node end = n[5];
		///System.out.println(search(g, start, end));
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
		
		
		
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}
		return g;
	}

}
