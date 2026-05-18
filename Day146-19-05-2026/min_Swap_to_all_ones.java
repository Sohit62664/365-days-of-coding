// Broute force 
// First of all count all the number of ones in the array 
// If the count of ones is equal to zero then return minus one which means that we can't make grouping
// Now your question has been changed from grouping to all the ones you can reframe like this Find the minimum subarray which having at least size of K which means the size of once and we have to count minimum number of zero in it because that will be your answer The minimum number of zero means this much we can SW so that's the brute force 
class Solution {
	public int minSwaps(int[] arr) {
		// code here
		int ones = 0 ;
		
		for (int num : arr) {
			if (num == 1) {
				ones++;
			}
		}
		
		if (ones == 0)
			return - 1;
		int n = arr.length;
		int ans = Integer.MAX_VALUE ;
		for (int i = 0 ; i<=n-ones ; i++) {
			int zeros = 0 ;
			for (int j = i ; j<i + ones ; j++) {
				if (arr[j] == 0) {
					zeros++;
				}
			}
			ans = Math.min(zeros, ans);
		}
		
		return ans;
		
	}
}



// Now the question is how we reach to the optimal answer
// 	Well since we have already deframe our question to find the minimum subarray which having the minimum number of zeros
// 	So in the pre approach our brute force approach we are solving this problem in big O of N square
// 	Now we have to think like that the minimum subarray problem how can I optimize it into big O of N
// 	So there may be many approaches like two pointer approach sliding window approach
// 	So here we have solved with this sliding window approach

class Solution {
	public int minSwaps(int[] arr) {
		// code here
		int k = 0 ;
		
		for (int num : arr) {
			if (num == 1) {
				k++;
			}
		}
		
		if (k == 0)
			return - 1;
		int n = arr.length;
		int ans = Integer.MAX_VALUE ;
		
		int i = 0 ;
		int j = 0 ;
		
		int zeros = 0;
		
		while (j < n) {
			
			if (arr[j] == 0) {
				zeros++;
			}
			
// 			j++;
			if (j - i +1  == k) { // WEindow Size Formula
				ans = Math.min(ans, zeros);
				j++;
				if (arr[i] == 0) {
					zeros--;
				}
				i++;
			}else{
			    j++;
			}
			
		}
		
		return ans;
		
	}
}

// Other approach for this problem may be prefix sum
// 	And we can transform our question to like find out the maximize the number of ones in a window
// 	What we can think index based and analyze the index Store all the index of and analyze the gap between them
