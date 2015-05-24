package mt.edu.um;

public class Edge   // connections of the vertices found in the graph
{
	private Vertex source, destination;   
	private double distance;
	
	
	public Edge ()  { }
	
	public Edge (Vertex src, Vertex dst, double d)
	{
		this.setSource(src);
		this.setDestination(dst);
		this.setDistance(d);
	}
	
	
	public void setSource (Vertex src)
	{
		source = src;
	}
	
	public void setDestination (Vertex dst)
	{
		destination = dst;
	}
	
	public void setDistance (double d)
	{
		distance = d;
	}
	
	
	public Vertex getSource ()
	{
		return source;
	}
	
	public Vertex getDestination ()
	{
		return destination;
	}
	
	public double getDistance ()
	{
		return distance;
	}
}
