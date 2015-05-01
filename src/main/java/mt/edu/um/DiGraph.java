package mt.edu.um;

import java.util.ArrayList;
import java.util.Random;

public class DiGraph   // a random directed graph (using an adjacency list as a representation)
{  
	
	private ArrayList<Vertex> adjList = new ArrayList<Vertex>();
	private int edge;
	
	public DiGraph () { }
	
	public DiGraph (int edge)
	{
		this.edge = edge;
	}
	
	
	public DiGraph buildGraph (int n, float p)
	{
		if (n <= 0)
			throw new IllegalArgumentException ("n must be a positive integer!");
		
		if ((p < 0) || (p > 1))
			throw new IllegalArgumentException ("p is a probability value!");
		
		Random randomGenerator = new Random();
		Vertex V = new Vertex();
	   
		for (int i = 0; i <= n; ++i)
		{
			adjList.add(V);
			V.setID(i);
			
	        float randomX = randomGenerator.nextInt(100);
	        float randomY = randomGenerator.nextInt(100);
	        float randomZ = randomGenerator.nextInt(100);
	        
	        V.setX(randomX);
	        V.setY(randomY);
	        V.setZ(randomZ);
	        
		}
		
		return null;
	}

}
