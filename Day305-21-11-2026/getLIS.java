class Solution {
	public ArrayList<Integer> getLIS(int arr[]) {
		// Code here
		
		int n = arr.length;
		
		int[] dp = new int[n];
		Arrays.fill(dp, 1) ;
		int[] hash = new int[n];
		
		int li = 0;
		
		int maxi = 1 ;
		
		for (int i = 0; i<n ; i++) {
			hash[i] = i ;
			for (int pre = 0 ; pre < i ; pre++) {
				if (arr[pre] < arr[i]) {
					// dp[i] = Math.max(dp[i] ,  1+ dp[pre]);
					
					if (dp[i] < 1 + dp[pre]) {
						dp[i] = dp[pre] + 1;
						
						hash[i] = pre;
					}
					
				}
				
			}
			if (maxi < dp[i]) {
				maxi = dp[i];
				li = i ;
			}
		}
		
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(arr[li]);
		int ii = li;
		while (hash[ii] != ii) {
			ii = hash[ii];
			ls.add(arr[ii]);
		}
		
		Collections.reverse(ls);
		
		// 		System.out.println(li);
		// 		System.out.println(ls);
		
		return ls;
	}
}
