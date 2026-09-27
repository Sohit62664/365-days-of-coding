public class Solution {
    public static int ninjaTraining(int n, int points[][]) {

        return helper(points , n-1 , 3);

        // Write your code here..
    }

    static int helper(int [][] task , int day , int last){
        if(day ==0 ){
            int max  = 0 ;
            for(int i=0 ; i< 3 ; i++){
                if(i!= last){
                    max = Math.max(max , task[0][i]);
                }
            }

            return max;
        }

        int maxp = 0 ;

        for(int i = 0; i < 3 ; i++){
            if(i != last){
                int points = task[day][i]+helper(task ,day-1 , i);
                maxp= Math.max(maxp , points);
            }
        }

        return maxp;


    }

}
