class Solution {
    public int maxArea(int[] height) {
        // max water = max area 
        // i.e. ( j - i ) * smallest of them ;
        // approach two pointers 

        int i = 0 ;
        int j = height.length-1 ;
        int max_water = 0 ;
        while(i<j){
            int breadth  = Math.min(height[j] , height[i]);
            int length = j-i;
            int water = length * breadth ;
            max_water = Math.max(max_water , water);
            if(height[j]>height[i]){
                i++;
            }else{
                j--;
            }
        }
        return max_water;
    }
}
