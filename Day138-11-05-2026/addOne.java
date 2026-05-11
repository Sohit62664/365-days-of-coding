// User function Template for Java

class Solution {
	// Function for adding one to the number represented by the array
	Vector<Integer> addOne(int[] arr) {
		// code here
		Vector<Integer> ans = new Vector<>();
		
		if (arr[arr.length - 1] != 9) {
			arr[arr.length - 1]++;
			
			for (int i = 0 ; i<arr.length ; i++) {
				ans.add(arr[i]);
			}
			
		} else {
			int j = arr.length - 1 ;
			while (j>= 0 && arr[j] == 9) {
				arr[j] = 0;
				j--;
			}
			if (j >= 0) {
				arr[j]++;
				for (int i = 0 ; i<arr.length ; i++) {
					ans.add(arr[i]);
				}
			} else {
				ans.add(1);
				for (int i = 0 ; i<arr.length ; i++) {
					ans.add(0);
				}
				
			}
			
		}
		return ans;
	}
}
