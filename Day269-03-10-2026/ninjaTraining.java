import java.util.*;
public class Solution {
    public static int ninjaTraining(int n, int points[][]) {
        // Recursive Approch 
        int [][] dp = new int[n][4];

        for(int i=0 ; i< n ; i++){
            // int [] dpr = dp[i];
            Arrays.fill(dp[i] , -1);
        }
        return helper(points , n-1 , 3 , dp );


        // Write your code here..
    }


    static int helper(int [][] points , int day , int last , int [][] dp ){
        if(day == 0 ){
            int max = 0 ; 
            for(int i =0 ; i< 3 ; i++){
                if(i != last){
                    max = Math.max(max , points[0][i]);
                }
            }
            return max;
        }

        if(dp[day][last] != -1) return dp[day][last] ;

        int max =0 ; 
        for(int i =0 ; i< 3 ; i++){
            if(i!= last){
                int point = points[day][i] + helper(points , day-1 , i , dp);

                max = Math.max(point, max);
            }
        }

        return dp[day][last] = max ;
    }

}
