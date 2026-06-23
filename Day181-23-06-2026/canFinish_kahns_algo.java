class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // using kahn's algorithims
        // Step1 Array Having the inDegrees

        int[] in_degree = new int[numCourses];

        for (int j = 0; j < prerequisites.length; j++) {
                int u = prerequisites[j][0];
                in_degree[u]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i =0 ; i < numCourses ; i++ ){
            if(in_degree[i]== 0){
                q.offer(i);
            }
        }

        // ArrayList<Integer> result = new ArrayList<>();

        while(!q.isEmpty()){
            int curr = q.poll();
            // result.add(curr);
            for(int i =0 ; i< prerequisites.length  ; i++){
                int u = prerequisites[i][0];
                int v = prerequisites[i][1];

                if(v == curr){
                    in_degree[u]--;
                    if(in_degree[u] == 0){
                        q.offer(u);
                    }
                }
            }
        }

        for(int i =0 ; i< numCourses ; i++){
            if(in_degree[i]!= 0){
                return false;
            }
        }

        return true;

    }
}
