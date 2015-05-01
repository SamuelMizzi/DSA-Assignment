package mt.edu.um;

public class Neighbor {
	
	private int vertexID;
	private Neighbor next;
	
	public Neighbor ()  { }
	
	public Neighbor (int vertexID, Neighbor next)
	{
		this.vertexID = vertexID;
		this.next = next;
	}

}
