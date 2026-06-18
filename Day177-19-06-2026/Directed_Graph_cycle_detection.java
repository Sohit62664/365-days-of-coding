package Directed_Graph;

import Undirected_Graph.Graph;

public class cycle {
    static boolean cycle_detection_d(int src, boolean[] recursion_path, boolean[] visited, Graph g) {

        visited[src] = true;
        recursion_path[src] = true;

        for (int v : g.l[src]) {
            if (!visited[v]) {
                if (cycle_detection_d(v, recursion_path, visited, g)) {
                    return true;
                }
            } else if (recursion_path[v]) {
                return true;
            }
        }

        recursion_path[src] = false;

        return false;
    }

    static boolean isCycle(Graph g) {
        boolean[] recursion_path = new boolean[g.V];
        boolean[] visited = new boolean[g.V];
        for (int i = 0; i < g.V; i++) {

            if (!visited[i]) {
                if (cycle_detection_d(i, recursion_path, visited, g)) {
                    return true;
                }
            }

        }

        return false;
    }




    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge_d(0 , 1);
        g.addEdge_d(1 , 2);
        g.addEdge_d(2 , 3);
        g.addEdge_d(3 , 1);


        if (cycle.isCycle(g)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}

// Running from the Parent folder

// cd "c:\Desktop data\java_practice\Graphs"
// javac Undirected_Graph\Graph.java Directed_Graph\cycle.java
// java Directed_Graph.cycle
