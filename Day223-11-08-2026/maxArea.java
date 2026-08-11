
// Simulating the Brute forcee approach 
class Solution {
    public int maxArea(int[] height) {
        //Using Two Pointes Approach 

        int max_w = 0 ;
        int n = height.length ;

        for(int i =0  ; i < n-1 ; i++){
            for(int j =  i+1 ; j< n ; j++){

                int len = j-i ; 
                int depth = depth = Math.min(height[j], height[i]);

                max_w  = Math.max( max_w , len * depth);

            }
        }

        return max_w;
    }
}
