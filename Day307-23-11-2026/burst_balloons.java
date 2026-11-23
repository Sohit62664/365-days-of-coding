class Solution {
    public int maxCoins(int[] nums) {
        int n= nums.length;

        int nc[] = new int[n+2];
        nc[0]= 1;
        nc[n+1]= 1;

        for(int i = 1 ; i<= n ; i++){
            nc[i] = nums[i-1];
        }
        return f(1 , n , nc , 1 , 1  );
    }

    int f(int i , int j , int[] nums , int l , int r ){
        if(i > j) return 0 ;
        // if(i== j) return nums[i] * l * r ; 
        int coins = 0 ;
        for(int k = i ; k<= j ; k++){
           int coin = l * nums[k] * r;
            // int coin = nums[k-1] * nums[k] *  nums[k+1] ;
            
            coin+= f(i, k-1 , nums , l ,  nums[k] )+ f(k+1 , j , nums , nums[k] , r);

            coins= Math.max(coins , coin);
            
        }

        return coins;
    }
}
