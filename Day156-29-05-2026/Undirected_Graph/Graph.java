package Undirected_Graph;
import java.util.*;

public class Graph {
    int V ;
    ArrayList<Integer> []l ; // Dynamic array 
    public Graph(int V){
        this.V= V;
        l = new ArrayList[V];  // list of the vertecis or List of the nebhours List [ , , , , ]


        for(int i =0 ; i< V ; i++){
            l[i] = new ArrayList<>(); //[[1], [0,2,3] , [1,4,3] , [1,2] , [2]]
        }

    }


    public void addEdge(int u , int v){
        l[u].add(v);
        l[v].add(u);
    }

    public void printGraph(){
        for(int i = 0 ; i< V ; i++){
            System.out.print(i + " -> "); 
            for(int neig : l[i]){
                System.out.print(neig + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);


        g.printGraph();
    }
}
