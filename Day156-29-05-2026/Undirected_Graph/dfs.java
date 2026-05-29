package Undirected_Graph;

public class DFS {
    public static void dfs(Graph g, boolean[] visited, int src) {
        if (visited[src])
            return;

        System.out.print(src + " ");

        visited[src] = true;

        for (int neigh : g.l[src]) {
            dfs(g, visited, neigh);
        }

    }

    public static void main(String[] args) {

        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(5, 6);
        boolean visited[] = new boolean[g.V];
        DFS.dfs(g, visited, 0);
    }
}
