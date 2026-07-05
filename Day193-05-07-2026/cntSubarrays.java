class Solution {
	public int cntSubarrays(int[] arr, int k) {
		// code here
		HashMap<Integer , Integer> map = new HashMap<>();
		// prefix_sum , frequency
		
		map.put(0, 1);
		int pre_sum = 0 ;
		int count = 0 ;
		
		for (int num : arr) {
			pre_sum += num ;
			if (map.containsKey(pre_sum - k)) {
				count += map.get(pre_sum - k);
			}
			map.put(pre_sum, map.getOrDefault(pre_sum, 0) + 1);
			
		}
		
		return count ;
	}
}
