package mt.edu.um;




public class Main 
{
    public static void main( String[] args )
    {
        DiGraph dg = new DiGraph();
        
        dg = dg.buildGraph(5, 0.8);
        
        
        //ShortestPath sp = new ShortestPath();
        //sp.path(dg);
        
        System.out.println("Vertex Size: "  + dg.getVertexSize());
        System.out.println("Edge Size: " + dg.getEdgeSize());
        
        Vertex v1 = dg.getVertex(0);
        //Vertex v2 = dg.getVertex(1);
       
        System.out.println("Vertex 1 ID: " + v1.getID());
        /*
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
        */
        double pathLength = 0;
        ShortestPath sp = new ShortestPath();
        
        pathLength = sp.shortestPath(2, 3, dg);
        System.out.println("Path: " + pathLength);
        
        Dijkstra2 dj = new Dijkstra2();
        pathLength = dj.dijkstra(dg, 2, 4);
        System.out.println("Shortest path: " + pathLength);
        
        
        
    }
}
