package mt.edu.um;

import java.util.ArrayList;
import java.util.Random;

public class DiGraph   // a random directed graph (using an adjacency list as a representation)
{  
	
	private ArrayList<Vertex> adjList = new ArrayList<Vertex>();
	//private int edge;
	
	public DiGraph () { }
	
	public DiGraph (int n, float p)
	{
		buildGraph(n, p);
	}
	
	
	public DiGraph buildGraph (int n, double p)
	{
		if (n <= 0)
			throw new IllegalArgumentException ("n must be a positive integer!");
		
		if ((p < 0) || (p > 1))
			throw new IllegalArgumentException ("p must be between 0 and 1!");
		
		Random randomGenerator = new Random();
		//Vertex V = new Vertex();
	   
		for (int i = 0; i < n; ++i)
		{
	        float randomX = randomGenerator.nextInt(100);
	        float randomY = randomGenerator.nextInt(100);
	        float randomZ = randomGenerator.nextInt(100);
	        
	        Vertex V = new Vertex(i , randomX, randomY, randomZ);
	        adjList.add(V);
	        
		}
		
		return null;
	}
	
	/*
	public boolean addVertex (Vertex v)
	{
		adjList.add(v);
		return true;
	}
	*/

}
