package mt.edu.um;

public class Edge 
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
	
	
	Vertex getSource ()
	{
		return source;
	}
	
	Vertex getDestination ()
	{
		return destination;
	}
	
	double getDistance ()
	{
		return distance;
	}
}
