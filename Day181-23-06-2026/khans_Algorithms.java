/*public class Graph {
    public int V ;
    public ArrayList<Integer> []l ; // Dynamic array 
    public Graph(int V){
        this.V= V;
        l = new ArrayList[V];  // list of the vertecis or List of the nebhours List [ , , , , ]


        for(int i =0 ; i< V ; i++){
            l[i] = new ArrayList<>(); //[[1], [0,2,3] , [1,4,3] , [1,2] , [2]]
        }

    }
 

    public void addEdge_d(int u , int v){
        l[u].add(v);
        // l[v].add(u);
    }
}

*/

package Directed_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Undirected_Graph.Graph;

public class khan_s_Algo {

    public static ArrayList<Integer> khans(Graph g) {
        int[] in_degree = new int[g.V];
        for (int i = 0; i < g.V; i++) {
            for (int v : g.l[i]) {
                in_degree[v]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < g.V; i++) {
            if (in_degree[i] == 0) {
                q.offer(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!q.isEmpty()) {
            int curr = q.poll();
            result.add(curr);

            for (int v : g.l[curr]) {
                in_degree[v]--;
                if (in_degree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge_d(5, 2);
        g.addEdge_d(5, 0);
        g.addEdge_d(4, 0);
        g.addEdge_d(4, 1);
        g.addEdge_d(2, 3);
        g.addEdge_d(3, 1);

        System.out.println("Topological Order:");
        System.out.println(khans(g));
    }
}
