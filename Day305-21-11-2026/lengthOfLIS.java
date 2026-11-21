class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length ;
        
        return f(n-1 , Integer.MAX_VALUE , nums);
    }

    int f(int i , int prev ,int []nums){
        if(i< 0) return 0 ;

        int np =  f(i-1 , prev , nums);
        int p = Integer.MIN_VALUE ;

        if(nums[i] < prev){
            p = 1+ f(i-1 , nums[i] , nums);
        }

        return Math.max(np , p );
    }
}



//memoization 
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length ;
        // int e = (int) 10e4 ;
        int dp[][] = new int[n][n+1];

        for(int row[]: dp){
            Arrays.fill(row , -1);
        }
        return f(n-1 , -1 , nums , dp );
    }

    int f(int i , int prev ,int []nums , int [][] dp){
        if(i< 0) return 0 ;
        // int index = (int) 10e4 + prev ; 
        if(dp[i][prev+1] != -1) return dp[i][prev+1];

        int np =  f(i-1 , prev , nums , dp);
        int p = 0 ;
        
        if(prev== -1 || nums[i] <nums[prev]){
            p = 1+ f(i-1 , i, nums  , dp);
        }

        return dp[i][prev+1] = Math.max(np , p );
    }
}



//recursion

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;

        
        return f(0 ,  -1 , n , nums );
    }

    int f(int i , int prev_index ,int n , int[] nums ){
        if(i == n) return 0 ;

        int nt =  f(i+1 , prev_index  , n , nums);

        int take= 0 ; 

        if(prev_index==-1 || nums[prev_index] < nums[i] ){
            take =1 +  f(i+1 , i , n , nums);
        }

        return Math.max(take , nt);
    }
}


// memoization
// used prev+1 for ArrayIndexOutOfBound
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;
        int dp[][] = new int[n][n+1];
        for(int row[]: dp){
            Arrays.fill(row , -1);
        }
        return f(0 ,  -1 , n , nums , dp );
    }

    int f(int i , int prev_index ,int n , int[] nums ,int [][] dp){
        if(i == n) return 0 ;


        if(dp[i][prev_index+1] != -1) return dp[i][prev_index+1] ; 
        int nt =  f(i+1 , prev_index  , n , nums , dp );

        int take= 0 ; 

        if(prev_index==-1 || nums[prev_index] < nums[i]  ){
            take =1 +  f(i+1 , i , n , nums , dp );
        }

        return dp[i][prev_index+1] = Math.max(take , nt);
    }
}



// Tabulization 
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][]= new int[n+1][n+1];

        for(int i = n-1 ; i>= 0 ; i--){
            for(int pi = -1 ; pi<= n-1 ; pi++){
                int nt = dp[i+1][pi+1];
                int take =0 ;

                if(pi== -1 || nums[i]> nums[pi]){
                    take = 1 + dp[i+ 1][i+1];
                }

                dp[i][pi+1] = Math.max(nt , take);
            }
        }
        return dp[0][0];
     }
}




// simple dp approach
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int dp [] = new int [n];
        Arrays.fill(dp , 1);

        int maxi = 1 ;
        for(int i =0  ; i< n ; i++){
            for(int pre = 0 ; pre < i ; pre++){

                if(nums[pre] < nums[i])
                dp[i] = Math.max(dp[i] , 1+ dp[pre]);
            }
            maxi = Math.max(maxi , dp[i]);
        }

        return maxi;
    }
}




//Using Binry Search 


class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(arr[0]);
        int index = 0 ;
        for(int i = 1 ; i< n ; i++){
            if(ls.get(index) < arr[i]){
                ls.add(arr[i]);
                index++;
            }else{
                int ind = search(ls , 0 , index , arr[i]);
                
                ls.set(ind , arr[i]);
                
            }
        }

        System.out.println(ls);
        
        return index+1 ;
    }

    int search(ArrayList<Integer> ls , int st , int end , int target){
        
        while(st<=end){
            int mid = st+(end-st) / 2 ; 
            
            if(ls.get(mid) == target) {
                return mid ;
            }else if(ls.get(mid) < target ){
                st = mid+ 1;
            }else{
                end = mid-1;
            }
        }
        
        return st;
    }
}
