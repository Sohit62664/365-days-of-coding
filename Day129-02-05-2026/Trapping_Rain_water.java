class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // Concept of Array Preprocessing
        int left[] = new int[n];
        int right[] = new int[n];

        int leftmax = 0;
        for(int i = 0 ; i< n ; i++){
            leftmax = Math.max(leftmax , height[i]);
            left[i] = leftmax;
        }
        int rightmax= 0 ; // maximum block fro right side
        for(int j = n -1 ; j>= 0 ; j--){
             rightmax = Math.max(rightmax , height[j]);
             right[j]= rightmax;
        }

        int traped_water = 0 ;
        for(int i = 0 ; i< n ; i++){
            int min = Math.min(right[i] , left[i] );
            traped_water+= min-height[i];
        }
        return traped_water;


    }
}
