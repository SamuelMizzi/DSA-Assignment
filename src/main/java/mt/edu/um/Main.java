package mt.edu.um;


public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DiGraph dg = new DiGraph();
        
        dg.buildGraph(5, 0.77);
        
        
        //ShortestPath sp = new ShortestPath();
        //sp.path(dg);
        
        System.out.println(dg.getVertexSize());
        System.out.println(dg.getEdgeSize());
        
        Vertex v1 = dg.getVertex(0);
        Vertex v2 = dg.getVertex(1);
       
        System.out.println(v1.getID());
        
        ShortestPath sp = new ShortestPath(dg);
        double r = sp.getDistance(v1, v2);
        
        System.out.println(r);
    }
}
