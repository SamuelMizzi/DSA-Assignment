package mt.edu.um;


public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DiGraph dg = new DiGraph();
        
        dg.buildGraph(5, 0.5);
    }
}
