class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length ; 
        return f(n-1 , W , 0 , val , wt);
    }
    
    int f(int i , int W , int value , int [] val , int [] wt){
        if(i < 0){
            return value ;
        }
        
        
        int np = f(i-1 , W, value , val , wt);
        int pi = 0 ;
        
        if(W- wt[i] >= 0){
            pi = f(i-1  , W- wt[i] , value + val[i] , val , wt);
        }
        
        return Math.max(np , pi);
    }
}
