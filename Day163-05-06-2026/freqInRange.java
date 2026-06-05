class Solution {
	public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
		// code here
		// broute force is simple a loop  on Query
		// then start a loop from lt o r and count x and store
		// as per the constraints it's not gonna work
		
		ArrayList < Integer> ans = new ArrayList<>();
		
		for (int[] q : queries) {
			int l = q[0];
			int r = q[1];
			int x = q[2];
			int count = 0;
			for (int i = l ; i <= r ; i++) {
				if (arr[i] == x) {
					count++;
				}
			}
			
			ans.add(count);
		}
		
		return ans;
	}
}

