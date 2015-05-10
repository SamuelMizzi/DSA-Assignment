package mt.edu.um;

import java.util.ArrayList;
import java.util.Random;

public class DiGraph   // a random directed graph (using an adjacency list as a representation)
{  
	
	private ArrayList<Vertex> adjList = new ArrayList<Vertex>();
	private ArrayList<Edge> edges = new ArrayList<Edge>();
	//private int edge;
	
	public DiGraph () { }
	
	public DiGraph (int n, float p)
	{
		buildGraph(n, p);
	}
	
	
	public DiGraph buildGraph (int n, double p)
	{
		if (n <= 0)
			throw new IllegalArgumentException ("n must be a positive integer!");  //tbc
		
		if ((p < 0) || (p > 1))
			throw new IllegalArgumentException ("p must be between 0 and 1!");    //tbc
		
		Random randGen = new Random();
		int eProb = 0;    // all possible edges that can exist
		//Vertex V = new Vertex();
	    
		// creating the vertices of the graph
		for (int i = 0; i < n; ++i)
		{
	        double rX1 = randGen.nextDouble();
	        int rX2 = randGen.nextInt(100);
	        double randX = rX1 + rX2;
	        double rY1 = randGen.nextDouble();
	        int rY2 = randGen.nextInt(100);
	        double randY = rY1 + rY2;
	        double rZ1 = randGen.nextDouble();
	        int rZ2 = randGen.nextInt(100);
	        double randZ = rZ1 + rZ2;
	        
	        
	        Vertex V = new Vertex(i, randX, randY, randZ);
	        adjList.add(V);
	        
	        System.out.println("Vertex: " + i);  // checking
	        System.out.println("X " + randX);
	        System.out.println("Y " + randY);
	        System.out.println("Z " + randZ);
	        
	        // finding the number of checks to be done all the different pairs of edges that exist in the graph
	        eProb += i;
		}
		
		eProb *= 2;    // since edges are directed
		//double prob = randGenerator.nextDouble();  // number between 0 and 1
		//System.out.println(prob);
		
		// finding the number of checks to be done all the different pairs of edges that exist in the graph
		/*int eProb = 0;
		for (int i = n; i != 0; --i)
		{
			eProb += i;
		}  */
		System.out.println(eProb);
		//if (p <= prob)
		// and calculate distances
		Vertex a = null;
		Vertex b = null;
		int m = eProb / n;   // m is the max no of edges that can be created in a single count/loop...
		
		// creating edges in the graph according to probability
		for (int i = 0; i < n; ++i)
		{
			a = adjList.get(i);
			System.out.println("Source: " + a.getID());
			for (int j = 0; j <= m; ++j)
			{
				if ((i == j))     // no edges at the same vertex
					++j; 
				
				if (j > m) break;   //////////////
				
				b = adjList.get(j);
				double prob = randGen.nextDouble();
				if (p <= prob) continue;
				
				else 
				{
					// working distance between the 2 vertices
					double dist = vertexDistance(a, b);
					Edge E = new Edge(a, b, dist);
					edges.add(E);
					System.out.println("Edge Created " + E.getDistance());
				}
			}
		}

		return null;
	}
	
	// method to find the distance of the edge between the two particular vertices
	public double vertexDistance (Vertex a, Vertex b)  
	{
		double aX = a.getX(),
			   aY = a.getY(),
			   aZ = a.getZ(),
			   bX = b.getX(),
			   bY = b.getY(),
			   bZ = b.getZ();
		
		double squareX = bX - aX;
		squareX *= squareX;
		
		double squareY = bY - aY;
		squareY *= squareY;
		
		double squareZ = bZ - aZ;
		squareZ *= squareZ;
		
		double ans = squareX + squareY + squareZ;
		ans = Math.sqrt(ans);
		
		return ans;
	}
	
	
	
	// then seperate the classes...
	//public void edges ()   // edges are created according to the probability

}
