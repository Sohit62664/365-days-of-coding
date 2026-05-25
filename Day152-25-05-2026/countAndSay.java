class Solution {
	public String countAndSay(int n) {
		// code here
		// I need to the nth number of the sequance
		// first Approach genrating the Sequances
		
		if (n == 1)
			return "1";
		
		String curr = "1";
		for (int i = 2 ; i <= n ; i++) {
			StringBuilder sb = new StringBuilder();
			int cnt = 1;
			for (int j = 1 ; j<curr.length() ; j++) {
				if (curr.charAt(j) == curr.charAt(j - 1)) {
					cnt++;
				} else {
					sb.append(cnt).append(curr.charAt(j - 1));
					cnt = 1;
				}
			}
			
			// adding the last one
			sb.append(cnt).append(curr.charAt(curr.length()-1));
			curr = sb.toString();
		}
		
		
		return curr;
	}
}
