class Solution {
	int majorityElement(int arr[]) {
		// code here
		// ArrayS.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for (int num : map.keySet()) {
			int freq = map.get(num);
			
			if (freq>(arr.length/2)) {
				return num;
			}
		}
		
		return - 1;
		
	}
}



//Space Optimized Approach 
class Solution {
    int majorityElement(int arr[]) {
        // code here
        // O(1) --> space 
        
        Arrays.sort(arr);
        int mid = arr[arr.length/2];
        
        int f= 0 ;
        for(int num : arr){
            if(num == mid){
                f++;
            }
        }
        
        if(f > arr.length/2){
            return mid;
        }else{
            return -1 ;
        }
    }
}
