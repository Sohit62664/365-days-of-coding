class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //Using Recursion 

        return f(0 , 0 , triangle);
    }

    int f(int i , int j , List<List<Integer>> a){
        if(i == a.size() -1) return a.get(a.size() -1).get(j);


        int down = f(i+1 , j , a) ;
        int digo = f(i+1 , j+1 , a);

        return a.get(i).get(j) + Math.min(down , digo);
    }
}
// implimantation the same recursion 

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //Using Recursion 

        return f(0 , 0 , triangle);
    }

    int f(int i , int j , List<List<Integer>> a){
        if(i == a.size() -1) return a.get(a.size() -1).get(j);

        // current + search the best at the remaining part
        int down =a.get(i).get(j) + f(i+1 , j , a) ;
        int digo = a.get(i).get(j) +  f(i+1 , j+1 , a);

        return  Math.min(down , digo);
    }
}








// Memoization
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // Since it having overlapping subproblemas so we can do memoization
        int n = triangle.size();

        int dp[][] = new int[n][n];

        for(int [] arr : dp){
            Arrays.fill(arr, -1 );
        }

        return f(0 , 0 , triangle , dp);
    }

    int f(int i , int j , List<List<Integer>> a , int[][] dp){

        if(i == a.size() -1) return a.get(i).get(j);

        if(dp[i][j]!= -1) return dp[i][j];

        // take the current  then calculate the minimum for the remaining 
        int down = a.get(i).get(j) + f(i+1 , j , a , dp) ;
        int digo = a.get(i).get(j) + f(i+1 , j+1 , a , dp);

        return dp[i][j] = Math.min(down , digo);
    }
}
