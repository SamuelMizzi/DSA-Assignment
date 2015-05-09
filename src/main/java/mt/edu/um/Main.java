package mt.edu.um;


public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DiGraph dg = new DiGraph();
        
        dg.buildGraph(4, 0.5);
        
        System.out.println(dg.getVertices());
        System.out.println(dg.getEdges());
    }
}
