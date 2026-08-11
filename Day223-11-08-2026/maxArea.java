
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





//Optimized approach 


class Solution {
    public int maxArea(int[] height) {
        //Using Two Pointes Approach 

        int i =0 ; 
        int j = height.length-1 ;

        int max_w = 0 ;
        while(i< j ){
            int len = j - i ;
            int depth = Math.min(height[j], height[i]);

            max_w  = Math.max( max_w , len * depth);

            if(height [i] < height[j]){
                i++;
            }else{
                j--;
            }
            
        }

        return max_w;
    }
}
