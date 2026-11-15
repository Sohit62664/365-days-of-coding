class Solution {
    public int cutRod(int[] price) {
        // code here
        // Standard recursive solution 
        
        int n = price.length;
        return f(n-1 , n, price );
    }
    
    int f(int i ,int N , int[] price){
        // if(i == 0){
        //     return N * price[0];
        // }
        
        if(i < 0 ){
            return 0 ;
        }
        
        int nt = 0+ f(i-1 , N , price);
        int take = Integer.MIN_VALUE;
        
        int rod_length = i + 1;
        
        if(rod_length<= N){// rod length is lesser then required
            take = price[i] + f(i , N- rod_length , price);
        }
        
        return Math.max(nt , take);
    }
}
