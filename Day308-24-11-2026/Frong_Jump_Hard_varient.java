class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if (stones[1] != 1) return false;
        return f(1, 1, n, stones);
    }

    boolean f(int i, int jump, int n, int[] arr) {

        if (i == n - 1) {
            return true;
        }

        boolean curr = false;
        boolean pre = false;
        boolean next = false;

        //choose k-1 jump
        if (jump - 1 > 0) {
            int target = arr[i] + jump - 1;
            for (int k = i + 1; k < n && arr[k] <= target; k++) {
                if (arr[k] == target) {
                    pre = f(k, jump - 1, n, arr);
                    break;
                }

            }
        }

        //choose k
        int target = arr[i] + jump ;
        for (int k = i + 1; k < n && arr[k] <= target; k++) {
            if (arr[k] == target) {
                curr = f(k, jump, n, arr);
                break;
            }

        }

        // k+1 

        target = arr[i]+ jump+1 ;
        for (int k = i + 1; k < n && arr[k] <= target; k++) {
            if (arr[k] == target) {
                next = f(k, jump+1, n, arr);
                break;
            }

        }


        return curr || pre || next;
    }
}



//Memoization

class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if (stones[1] != 1) return false;

        Boolean dp[][] = new Boolean[n+1][n+1];
        for(Boolean x []: dp){
            Arrays.fill( x  , null);
        }
        return f(1, 1, n, stones , dp );
    }

    boolean f(int i, int jump, int n, int[] arr , Boolean [][] dp) {

        if (i == n - 1) {
            return true;
        }

        if(dp[i][jump] != null) return dp[i][jump];

        boolean curr = false;
        boolean pre = false;
        boolean next = false;

        //choose k-1 jump
        if (jump - 1 > 0) {
            int target = arr[i] + jump - 1;
            for (int k = i + 1; k < n && arr[k] <= target; k++) {
                if (arr[k] == target) {
                    pre = f(k, jump - 1, n, arr, dp);
                    break;
                }

            }
        }

        //choose k
        int target = arr[i] + jump ;
        for (int k = i + 1; k < n && arr[k] <= target; k++) {
            if (arr[k] == target) {
                curr = f(k, jump, n, arr, dp);
                break;
            }

        }

        // k+1 

        target = arr[i]+ jump+1 ;
        for (int k = i + 1; k < n && arr[k] <= target; k++) {
            if (arr[k] == target) {
                next = f(k, jump+1, n, arr, dp);
                break;
            }

        }


        return  dp[i][jump] = curr || pre || next;
    }
}
