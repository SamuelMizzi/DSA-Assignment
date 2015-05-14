package mt.edu.um;

import java.util.ArrayList;
import java.util.List;


public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DiGraph dg = new DiGraph();
        
        dg.buildGraph(5, 0.5);
        
        
        //ShortestPath sp = new ShortestPath();
        //sp.path(dg);
        
        System.out.println(dg.getVertexSize());
        System.out.println(dg.getEdgeSize());
        
        Vertex v1 = dg.getVertex(0);
        Vertex v2 = dg.getVertex(1);
       
        System.out.println(v1.getID());
        
        ShortestPath sp = new ShortestPath(dg);
        double r = sp.getDistance(v1, v2);
        
        /////////////////////////////////////////////////////////////
        List <Vertex> n = new ArrayList<Vertex>();
        n = dg.getNeighbours(v1);
        System.out.println("Neighbours of vertex 0");
        for (Vertex v: n){
        	System.out.println(v.getID());
        }
        /////////////////////////////////////////////////////////////
        
        sp.path(v1, v1);  // gives the same
    }
}
