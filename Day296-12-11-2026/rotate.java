class Solution {
	ArrayList<Integer> rotate(int n, int d) {
		// code here
		// int to binary Array
		// take two pointers and rotate them
		
	    d = d % 16;
		int left  = ((n<<d) |(n>>(16-d)))&0xFFFF;
		int right = ((n>>d) |(n<<(16-d)))&0xFFFF;
		
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(left);
		ans.add(right);
		
		return ans;
		
	}
}
