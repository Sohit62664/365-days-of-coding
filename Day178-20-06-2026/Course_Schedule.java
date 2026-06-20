class Graph {
    int V;
    ArrayList<List<Integer>> l = new ArrayList<>(V);

    //constructor
    Graph(int V) {
        this.V = V;
        for (int i = 0; i < V; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            l.add(list);
        }
    }

    void addEdge(int a, int b) {
        l.get(b).add(a);
        return;
    }
}

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //Releted Topics 
        // Topological Sort and Cycle detection in a graph

        //making a graph
        int n = prerequisites.length;

        Graph g = new Graph(numCourses);
        for (int i = 0; i < n; i++) {

            g.addEdge(prerequisites[i][0], prerequisites[i][1]);

        }

        //cycle detection 
        // if cycle exist then no topological sorting just return false ;
        // else return true

        return !cycle(g);
    }

    boolean cycle(Graph g) {

        boolean visited[] = new boolean[g.V];
        boolean path[] = new boolean[g.V];
        for (int i = 0; i < g.V; i++) {
            if (!visited[i]) {

                if (check(i, g, visited, path)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean check(int src, Graph g, boolean[] visited, boolean[] path) {
        visited[src] = true;
        path[src] = true;
        for (int v : g.l.get(src)) {
            if (!visited[v]) {
                if (check(v, g, visited, path)) {
                    return true;
                }
            } else if (path[v]) {
                return true;
            }
        }

        //backtracking
        path[src] = false;

        return false;
    }
}















//Withot making Graph Class less efficient 45ms but with class 3ms
class Solution {

    boolean isCycle(int src , int [][] prerequisites , boolean [] visited , boolean [] path){
        visited[src]= true;
        path[src]= true ;

        for(int i =0 ; i< prerequisites.length ; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            if(u == src){
                if(!visited[v]){                
                    if(isCycle(v , prerequisites , visited , path)){
                        return true;
                    }
                }else if(path[v]){
                    return true;
                }

            }
        }
        path[src]= false ;
        return false ;

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean [] visited = new boolean [numCourses];
        boolean [] path = new boolean [numCourses];

        for(int i = 0 ;i<numCourses ; i++){
            if(isCycle(i , prerequisites , visited , path)){
                return false;
            }
        }

        return true;
    }
}
