package mt.edu.um;

import java.util.ArrayList;
import java.util.List;


public class ShortestPath  // finding the shortest path between 2 vertices (q & r), using Dijkstra's Algorithm
{ 
	
	private final List<Vertex> nodes = new ArrayList<Vertex>();
	private final List<Edge> edges = new ArrayList<Edge>();
	
	public void path(DiGraph g)
	{
		
	}
	
	public double getDistance(Vertex node, Vertex target) {
	    for (Edge edge : edges) {
	      if (edge.getSource().equals(node)
	          && edge.getDestination().equals(target)) {
	        return edge.getDistance();
	      }
	    }
	    throw new RuntimeException("Should not happen");
	  }
}
