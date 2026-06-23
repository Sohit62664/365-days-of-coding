class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // logic : if there is an cycle then not posible return false;
        // else true

        //detect cycle
        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (isCycle(i, prerequisites, visited, path)) {
                return false;
            }
        }

        return true;

    }

    boolean isCycle(int src, int[][] pre, boolean[] visited, boolean[] path) {
        //cycle in a directed graph 1. visited and available in recursion stack

        //search nebhours 
        visited[src] = true;
        path[src] = true;

        for (int i = 0; i < pre.length; i++) {
            int u = pre[i][0];
            int v = pre[i][1];

            if (u == src) {
                if (!visited[v]) {
                    if (isCycle(v, pre, visited, path))
                        return true;
                }else if(path[v]) { //path detectted   v is alreaady visitred and is in path
                    return true;
                }
            }

        }

        path[src] = false; // removing from the Recursion Stack
        return false;
    }

}
