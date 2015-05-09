package mt.edu.um;


public class Vertex 
{
	private int ID;
	private double x, y, z;
	
	public Vertex () { }
	
	public Vertex (int ID, double x, double y, double z)
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
	
	int getID ()
	{
		return ID;
	}
	
	double getX ()
	{
		return x;
	}
	
	double getY ()
	{
		return y;
	}
	
	double getZ ()
	{
		return z;
	}

}
