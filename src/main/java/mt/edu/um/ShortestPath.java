package mt.edu.um;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ShortestPath  // finding the shortest path between 2 vertices (q & r), using Dijkstra's Algorithm
{ 
	
	private List<Vertex> vertices;
	private List<Edge> edges;
	
	public ShortestPath ()  {} 
	
	public ShortestPath (DiGraph graph)
	{
		this.vertices = new ArrayList<Vertex>(graph.getVertices());
		this.edges = new ArrayList<Edge>(graph.getEdges());
	}
	
	public double path(Vertex start, Vertex target)   // Dijkstra
	{
		if (start.equals(target)) {
			System.out.println("THESAME");
            return 0.0;
		}
		return 0;
    
	}
	
	
	
	public double getDistance(Vertex start, Vertex target) 
	{
	    for (Edge edge : edges) 
	    {
	      if (edge.getSource().equals(start) && edge.getDestination().equals(target)) 
	    	  return edge.getDistance();
	      
	    }
	    throw new RuntimeException("Should not happen");
	}
	/*
	private int getShortestDistance(Vertex destination) {
	    Integer d = distance.get(destination);
	    if (d == null) {
	      return Integer.MAX_VALUE;
	    } else {
	      return d;
	    }
	  }  */
}
