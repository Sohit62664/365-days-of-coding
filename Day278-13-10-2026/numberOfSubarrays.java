class Solution {
    public int numberOfSubarrays(int[] arr, int target) {
        // code here
        HashMap <Integer,Integer> map = new HashMap<>();
        int count =0 ;
        map.put(0 , 1 );
        int sum =0 ;
        for(int i =0 ; i< arr.length ; i++){
            sum += arr[i];
            
            int key = sum - target;
            if(map.containsKey(key)){
                count+= map.get(key);
            }
            
            map.put(sum , map.getOrDefault(sum , 0 ) +1);
            
            
        }
        
        return count;
    }
}




//optimize approach 
class Solution {
	public int numberOfSubarrays(int[] arr, int target) {
		// code here
		return helper(arr, target) - helper(arr, target - 1);
	}
	int helper(int [] arr, int k) {
		int left = 0 ;
		int sum = 0 ;
		int count = 0 ;
		for (int r = 0; r<arr.length ; r++) {
			sum += arr[r];
			
			while (sum > k) {
				sum -= arr[left];
				left++;
			}
			
			count += r - left + 1;
			
		}
		return count;
	}
}
