class Solution {
	public String nextPalin(String n) {
		// code here
		// genrate next palindrome with same digits
		// increse by 1 and check for palindrom
		
		// Approach 2 :
		// Genrate next permutation which is palindrom
		int len = n.length();
		
		int [] nums = new int[len];
		int [] copy = new int[len];
		int j = 0;
		
		for (int i = 0 ; i<len ; i++) {
			char ch = n.charAt(i);
			int t = Character.getNumericValue(ch);
			nums[j] = t;
			copy[j] = t;
			j++;
		}
		
		// while next permutation if it is palindrom then return it
		
		boolean found = false;
		
		while (nextPermutation(nums)) {
			
			if (palindrom(nums)) {
				found = true;
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int num : nums) {
			sb.append(num);
		}
		
		if (!found) {
			return "-1";
		}
		
		return sb.toString();
		
	}
	
	boolean palindrom(int[] nums) {
		
		int i = 0;
		int j = nums.length - 1;
		
		while (i < j) {
			
			if (nums[i] != nums[j]) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
	
	boolean nextPermutation(int[] nums) {
		
		int pivot = breakpoint(nums);
		int n = nums.length;
		
		if (pivot == -1) {
			reverse(nums, 0, n - 1);
			return false;
		}
		
		int next = n - 1;
		
		for (int i = n - 1; i > pivot; i--) {
			
			if (nums[i] > nums[pivot]) {
				next = i;
				break;
			}
		}
		
		swap(nums, pivot, next);
		
		reverse(nums, pivot + 1, n - 1);
		
		return true;
	}
	
	int breakpoint(int[] nums) {
		
		int n = nums.length - 2;
		
		while (n >= 0 && nums[n] >= nums[n + 1]) {
			n--;
		}
		
		return n;
	}
	
	void swap(int[] nums, int i, int j) {
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	void reverse(int[] nums, int i, int j) {
		
		while (i < j) {
			
			swap(nums, i, j);
			i++;
			j--;
		}
	}
	
}
