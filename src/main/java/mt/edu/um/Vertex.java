package mt.edu.um;

 
public class Vertex     //  vertices build up the graph
{
	private int ID;
	private double x, y, z;
	
	public Vertex () { }
	
	public Vertex (int ID, double x, double y, double z, boolean settled)
	{
		this.ID = ID;
		this.x = x;
		this.y = y;
		this.z = z;
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

}
