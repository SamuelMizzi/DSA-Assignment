package mt.edu.um;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ShortestPath  // finding the shortest path between 2 vertices (q & r), using Dijkstra's Algorithm
{
	public double shortestPath (int q, int r, DiGraph g)
	{
		if ((q >= g.getVertexSize()) || r >= g.getVertexSize())   // validation
		{
			System.out.println("Vertex does not exist!");
			return 0.0;
		}
		
		if (q == r)
		{
			System.out.println("Vertex returning to itself!");
			return 0.0;
		}
		
		double pathAcc = 0;   // temporary
		Vertex srcV, dstV;    // source and destination vertices
		List<Vertex> neighbours = new ArrayList<Vertex>();   
		
		srcV = g.getVertex(q);
		dstV = g.getVertex(r);
		
		srcV.setDistance(0);   //  setting source distance to 0
		
		neighbours = g.getNeighbours(srcV);
		System.out.println(neighbours);
		
		//for (int i = 0; i < g.getVertexSize())
		
		return 0;
		
		
	}
/*	
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
    
	
	Set<Vertex> processed = new HashSet<Vertex>();
    Map<Vertex, Integer> cost = new TreeMap<Vertex, Integer>();
    Map<Vertex, List<Vertex>> pre = new HashMap<Vertex, List<Vertex>>();
    //Sets initial costs to infinity for all vertices except sourceVertex
    for (Vertex v: vertices) {
            pre.put(v, new ArrayList<Vertex>());
            if (v.equals(start)) {
                    cost.put(start, 0);
            }
            else {
                    cost.put(v, Integer.MAX_VALUE);
            }
    }
    while (vertices.size() != processed.size()) {
            Vertex min = null;
            Integer minimum = Integer.MAX_VALUE;
            for (Vertex v: cost.keySet()) {
                    if (cost.get(v).compareTo(minimum) <= 0
                                    && !processed.contains(v)) {
                            minimum = cost.get(v);
                            min = v;
                    }
            }
            processed.add(min);
            for (Vertex neighbor: getNeighbours(min)) {
                    if (!processed.contains(neighbor)) {
                            if (cost.get(neighbor).compareTo(cost.get(min)
                                            + getEdge(min, neighbor)) > 0) {
                                    Integer newVal = cost.get(min)
                                                    + getEdge(min, neighbor);
                                    cost.remove(neighbor);
                                    cost.put(neighbor, newVal);
                                    ArrayList<Vertex> mod = new ArrayList<Vertex>(pre.get(min));
                                    mod.add(neighbor);
                                    pre.put(min, mod);
                            }
                    }
            }
    }
    if (pre.get(target).size() == 0) {
            return -1;
    }
    ArrayList<Vertex> check = new ArrayList<Vertex>(pre.get(target));
    while (check.get(0).compareTo(start) != 0) {
            Vertex temp = check.get(0);
            check.addAll(0, pre.get(temp));
    }
    check.add(target);
    shortestPath.addAll(check);
    return cost.get(target);
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
	  }  *//*
	public List<Vertex> getNeighbours (Vertex v)
	{
		List<Vertex> neighbours = new ArrayList<Vertex>();
		for (Edge E : edges)
		{
			if (E.getSource().equals(v))
			{
				neighbours.add(E.getDestination());
			}
		}
		
		return neighbours;			
	}  */
}
