package mt.edu.um;

import java.util.ArrayList;

public class Vertex 
{
	private int ID;
	private float x, y, z;
	
	public Vertex() { }
	
	public Vertex(int ID, float x, float y, float z)
	{
		this.ID = ID;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	
	

	
	private ArrayList<Vertex> adjList = new ArrayList<Vertex>();
	

}
