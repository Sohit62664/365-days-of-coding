// By HashMap 
class Solution {
	int majorityElement(int arr[]) {
		// code here
		HashMap <Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1) ;
		}
		
		int n = arr.length;
		for (int i = 0 ; i<n ; i++) {
			int val = map.get(arr[i]) ;
			if (val>(n/2))
				return arr[i];
		}
		return -1 ;
	}
}


// brute force  
//   count every elment frwuincy and check it is Greter then n/2 
//   takes O(n^2) times
