package Directed_Graph;

// import java.util.ArrayDeque;
import java.util.ArrayList;
// import java.util.Deque;
import java.util.Stack;

import Undirected_Graph.Graph;

/*
Topological Sort 
u-->v 
maintain the condition u always come first then v 

NOTE: This is only for Acyclic Directed Graph (ADG) 


*/

public class Top_sort {
    // Deque<Integer> st = new ArrayDeque<>();
    static Stack<Integer> st = new Stack<>();

    static void t_sort(int src, boolean[] visited, Graph g) {
        visited[src] = true;
        for (int v : g.l[src]) {
            if (!visited[v]) {
                t_sort(v, visited, g);
            }
        }
        st.push(src);
    }

    static void top_sorting(Graph g) {
        boolean visited[] = new boolean[g.V];

        for (int i = 0; i < g.V; i++) {
            if (!visited[i])
                t_sort(i, visited, g);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!st.empty()) {
            int t = st.pop();
            ans.add(t);
        }
        System.out.println(ans.toString());
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge_d(5, 0);
        g.addEdge_d(4, 0);
        g.addEdge_d(5, 2);
        g.addEdge_d(2, 3);
        g.addEdge_d(3, 1);
        g.addEdge_d(4, 1);

        top_sorting(g);
    }

}
