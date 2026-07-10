class Solution {
	public int longestConsecutive(int[] arr) {
		// code here
		HashSet<Integer> set = new HashSet <>();
		
		for (int x : arr)
			set.add(x);
		
		int longest = 0 ;
		for (int x : set) {
			if (!set.contains(x - 1)) {
				int count = 1 ;
				int curr = x ;
				while (set.contains(curr + 1)) {
					curr++;
					count++;
				}
				
				longest = Math.max(longest, count);
			}
		}
		
		return longest;
	}
}
