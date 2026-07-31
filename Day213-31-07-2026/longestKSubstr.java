class Solution {
	public int longestKSubstr(String s, int k) {
		// code here
		HashMap<Character, Integer> map = new HashMap<>();
		
		int left = 0 ;
		int maxlen = -1 ; 
		
		for (int right = 0 ; right<s.length() ; right++) {
			char ch = s.charAt(right);
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			
			while (map.size()>k) {
				char le = s.charAt(left);
				map.put(le, map.get(le) - 1);
				if (map.get(le) == 0) {
					map.remove(le);
				}
				left++;
				
			}
			if (map.size() == k) {
				maxlen = Math.max(maxlen, right - left + 1);
				
			}
		}
		return maxlen;
	}
}
