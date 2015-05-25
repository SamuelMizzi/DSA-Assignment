package mt.edu.um;

public class Edge   // connections of the vertices found in the graph
{
	private Vertex source, destination;   
	private double weight;
	
	
	public Edge ()  { }
	
	public Edge (Vertex src, Vertex dst, double w)
	{
		this.setSource(src);
		this.setDestination(dst);
		this.setWeight(w);
	}
	
	
	public void setSource (Vertex src)
	{
		source = src;
	}
	
	public void setDestination (Vertex dst)
	{
		destination = dst;
	}
	
	public void setWeight (double w)
	{
		weight = w;
	}
	
	
	public Vertex getSource ()
	{
		return source;
	}
	
	public Vertex getDestination ()
	{
		return destination;
	}
	
	public double getWeight ()
	{
		return weight;
	}
}
