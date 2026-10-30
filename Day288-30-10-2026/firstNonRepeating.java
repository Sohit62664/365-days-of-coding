class Solution {
	public String firstNonRepeating(String s) {
		// code here
		// Brute Force Implimentation
		
		String ans = "";
		int n = s.length();
		HashMap<Character, Integer> map = new HashMap<>();
		char ch [] = s.toCharArray();
		for (int i = 0 ; i < n ; i++) {
			char c = ch[i];
			map.put(c, map.getOrDefault(c, 0) + 1);
			
			boolean flag = true ;
			for (int j = 0 ; j <= i ; j ++) {
				if (map.get(ch[j]) == 1) {
					ans += ch[j];
					flag = false;
					break ;
				}
			}
			
			if (flag) {
				ans += "#";
			}
			
		}
	return ans;
	}
	
	
}
