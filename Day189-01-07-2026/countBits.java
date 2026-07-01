class Solution {
    public int[] countBits(int n) {
        // From  0 to n for each i count number of 1s in the i'th binary representation and store them into An Array and return the Array 


        // brute force is simple juct count for each i 
        // using O(n log n)
        int arr []  = new int[n+1];

        for(int i =0 ; i<=n ; i++){
            arr[i] = countset(i);

        }
        return arr ;
        
        
    }

    int countset(int n){
        int count = 0;
        while(n!= 0 ){
            n = n& (n-1) ; // it Clears the lowest setbit(i.e. 1)  
            count++;
        }

        return count ;
        
    }
}


//Note: n = n& (n-1) ; // it Clears the lowest setbit(i.e. 1)  



class Solution {
    public int[] countBits(int n) {
        // From  0 to n for each i count number of 1s in the i'th binary representation and store them into An Array and return the Array 

        // brute force is simple juct count for each i 
        
        // for O(n) we need to so the count 1's operation Should  be done within O(1); Since treversing all 0 to n Will tke O(n)
        int ans[] = new int[n + 1];

        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);

        }        
        return ans;
    }
}
