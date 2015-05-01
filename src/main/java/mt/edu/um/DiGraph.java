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
	   
		for (int i = 0; i <= n; ++i)
		{
	      //int randomInt = randomGenerator.nextInt(100);
		}
		
		return null;
	}

}
