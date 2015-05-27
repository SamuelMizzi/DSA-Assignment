package mt.edu.um;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra2 {
	
	public int dijkstra(DiGraph G, int i, int j){
	    //Get the number of vertices in G
	    int n = G.getVertexSize();

	    // The 'i' parameter indicates the starting node and the 'j' parameter
	    // is the ending node.


	    //Create a list of size n of shortest paths, initialize each entry to infinity
	    final int[] shortestPaths = new int[n];

	    

	    //Initialize starting node distance to zero.
	    shortestPaths[i] = 0;

	    //Make a Priority Queue (a heap)
	    PriorityQueue<Integer> PQ = new PriorityQueue<Integer>(n,
	        new Comparator<Integer>()
	            {
	                public int compare(Integer p, Integer q)
	                {
	                    return shortestPaths[p] - shortestPaths[q];
	                }
	            } );

	    //Populate the heap with the nodes of the graph
	    for(int k = 0; k < n; k++){
	        PQ.offer(k);
	    }

	    //While the heap has elements.
	    while(PQ.size() > 0){

	    //  Remove the minimum node distance from the heap.
	        int minimum = PQ.poll();

	    //  Check if graph is disconnected, if so, return -1.
	        if(shortestPaths[minimum] == Double.MAX_VALUE)
            {
                return -1;
            }
	    //  End node has been reached (i.e. you've found the shortest path), return the distance.
	        if( minimum == j){
	            return shortestPaths[j];
	        }

	    //  Take the current node and look through the row to see the vertices adjacent to it (neighbours)
	        for(Edge e: G.getEdges()){


	    //    Update the distances in the heap for the current node, using the following calculation:
	    //      min((deleted node distance + adjacent edge weight), current node's distance)
	        	
	        	int w = e.getSource().getID();
	        	Vertex v1 = G.getVertex(w);
	        	Vertex v2 = G.getVertex(minimum);
	            
	        	if (v1.getDistance() > (v2.getDistance() + e.getWeight()))
	        	{
	        		v1.setDistance(v2.getDistance() + e.getWeight());
	        		PQ.offer(v1.getID());
	        	}
	        	
	        }
	    }
	    return -1;

	}
}
