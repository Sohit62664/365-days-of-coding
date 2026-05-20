class Solution {
    public int maxWater(int arr[]) {
        // code here
        // Naive Approach 
        
        // find max in the left 
        // find max in the right
        // compute the trapped water at the index = min(left , right)-height of the index 
        int ans =0 ;
        
        int n= arr.length;
        
        for(int i =0 ; i< n ; i++){
            int left = arr[i];
            
            for(int j = 0 ; j< i ; j++){
                left = Math.max(left , arr[j]);
            }
            
            
            int right = arr[i];
            
            for(int j = i ; j< n ; j++){
                right = Math.max(right , arr[j]);
            }
            
            ans += Math.min(left , right) - arr[i];
        }
        
        return ans;
    }
}


// A little optimize one 
// same idea but calculating the sum in O(1)


class Solution {
	public int maxWater(int arr[]) {
		// to make it optimise we need to take the sum in O(1)
		
		// this can be done via array Pre Processing
		
		int ans = 0 ;
		
		int n = arr.length;
		int [] prefix = new int[n];
		int [] suffix = new int[n];
		
		int pre = 0;
		int suff = 0;
		for (int i = 0 ; i<n ; i++) {
			int j = n - i -1;
			pre = Math.max(arr[i], pre);
			prefix[i] = pre;
			
			suff = Math.max(arr[j], suff);
			suffix[j] = suff;
		}
		
		for (int i = 0 ; i<n ; i++) {
			ans += Math.min(prefix[i], suffix[i]) - arr[i];
		}
		
		return ans;
	}
}
