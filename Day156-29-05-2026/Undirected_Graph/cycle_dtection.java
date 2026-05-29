package Undirected_Graph;

public class cycle_dtection {
    static boolean cycle(int src , int par , boolean visited [] ,Graph g){
        visited[src] = true; 
        
        for(int v : g.l[src]){
            if(!visited[v]){
                if( cycle(v , src , visited , g)) return true ;

            }else{
                if(par != v ){
                    return true;
                }
            }
            
        }
        return false;

    }


    public static void main(String[] args) {

        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        // g.addEdge(2, 3);
        g.addEdge(2, 4);
        boolean visited[] = new boolean[g.V];
        if(cycle_dtection.cycle( 0 , -1, visited , g)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
