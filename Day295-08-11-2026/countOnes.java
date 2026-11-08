class Solution {
	public int countOnes(int[] arr) {
		// code here
		int st = 0 ;
		int end = arr.length - 1 ;
		int b = -1 ;
		
		while (st <= end) {
			int mid = st + (end - st)/ 2;
			
			if (arr[mid] == 1) {
				b = mid ;
				st = mid + 1;
			} else if (arr[mid] < 0) {
				st = mid + 1 ;
			} else {
				end = mid - 1 ;
			}
		}
		
		return b+1;
	}
}
