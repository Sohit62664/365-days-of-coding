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
