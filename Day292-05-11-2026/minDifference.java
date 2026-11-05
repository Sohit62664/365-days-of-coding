class Solution {
	int min = 0 ;
	public int minDifference(int arr[]) {
		// code here
		int tsum = 0 ;
		for (int x : arr)
			tsum += x;
		min = Integer.max_value ;
		
		int n = arr.length;
		
		return f(n - 1, 0, arr, tsum);
	}
	
	void f(int index, int sum2, int[] arr, int tsum) {
		if (index <= 0) {
			
			// 			min = Math.min(min, sum2);
			sum2+=arr[index];
			int sum1 = tsum - sum2;
			
			min = Math.min(min, Math.abs(sum1 - sum2));
			
			return;
		}
		
		
		int take = f(index - 1, sum2 + arr[index], arr, tsum);
		int not_take = f(index - 1, sum2, arr, tsum);
		
	}
}
