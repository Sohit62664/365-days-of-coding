package Undirected_Graph;

import java.util.*;

public class BFS extends Graph {
    public BFS(int V) {
        super(V);
    }

    void traverse(int source, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];

        q.offer(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u);

            for (int neigh : l[u]) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    q.offer(neigh);
                }

            }
        }

    }

    public static void main(String[] args) {

        BFS g = new BFS(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);

        g.traverse(1, 5);
    }

}
