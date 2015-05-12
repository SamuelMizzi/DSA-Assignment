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
        
        System.out.println(dg.getVertices());
        System.out.println(dg.getEdges());
        
        ShortestPath sp = new ShortestPath();
        //sp.getDistance(, 6);
    }
}
