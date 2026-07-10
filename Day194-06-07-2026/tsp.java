class Solution {
    public int tsp(int[][] cost) {
        // code here
        // brute Force Approach 
        int n = cost.length;
        
        boolean [] visited = new boolean[n] ; 
        
        visited[0]  = true ;
        
        return dfs(cost , visited , 0 , 1 );
    }
    
    int dfs(int [][] cost , boolean [] visited  , int last , int cnt ){
        int n = cost.length ; 
        
        if(cnt == n){
            return cost[last][0];
        }
        
        int mincost = (int)1e9 ; //1 billion 
        for(int c = 1 ; c < n ; c++){
            if(!visited[c]){
                visited[c]= true ; 
                mincost = Math.min(mincost , cost[last][c] +  dfs(cost , visited , c , cnt+1));
                
                
                visited[c] = false;
                
            }
        }
        
        return mincost ;
    }
}
