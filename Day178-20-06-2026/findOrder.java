class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        boolean [] visited2 = new boolean [numCourses];
        boolean [] visited = new boolean [numCourses];
        boolean [] path = new boolean [numCourses];

        int empty[] = new int[0];

        for(int i = 0 ;i<numCourses ; i++){
            if(isCycle(i , prerequisites , visited , path)){
                return empty;
            }
        }

        Stack<Integer> st = new Stack<>();

        for(int i =0 ; i< numCourses  ; i++){
            if(!visited2[i]){
                t_sort(i , prerequisites ,st , visited2);
            }
        }
        
        

        int ans [] = new int[st.size()] ;
        int i =0 ;
        while(!st.empty()){
            ans[i] = st.pop();
            i++;
        }

        return ans;
    }

    void t_sort(int src, int[][] prerequisites, Stack<Integer> st, boolean visited[]) {
        visited[src] = true;
        for(int i=0 ; i< prerequisites.length ; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            if(v == src){
                if(!visited[u])
                t_sort(u ,prerequisites , st , visited );
            }

        }
        st.push(src);
    }

    boolean isCycle(int src, int[][] prerequisites, boolean[] visited, boolean[] path) {
        visited[src] = true;
        path[src] = true;

        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            if (u == src) {
                if (!visited[v]) {
                    if (isCycle(v, prerequisites, visited, path)) {
                        return true;
                    }
                } else if (path[v]) {
                    return true;
                }

            }
        }
        path[src] = false;
        return false;

    }
}
