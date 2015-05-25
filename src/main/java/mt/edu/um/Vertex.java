package mt.edu.um;

 
public class Vertex     //  vertices build up the graph
{
	private int ID;
	private double x, y, z, distance; 
	//private boolean settled;
	
	public Vertex () { }
	
	public Vertex (int ID, double x, double y, double z, double distance)
	{
		this.ID = ID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.distance = distance;
	}
	
	
	public void setID (int ID)
	{
		this.ID = ID;
	}
	
	public void setX (float x)
	{
		this.x = x;
	}
	
	public void setY (float y)
	{
		this.y = y;
	}
	
	public void setZ (float z)
	{
		this.z = z;
	}
	
	public void setDistance (double distance)
	{
		this.distance = distance;
	}
	
	
	public int getID ()
	{
		return ID;
	}
	
	public double getX ()
	{
		return x;
	}
	
	public double getY ()
	{
		return y;
	}
	
	public double getZ ()
	{
		return z;
	}
	
	public double getDistance ()
	{
		return distance;
	}

}
