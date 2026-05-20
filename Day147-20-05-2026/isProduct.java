class Solution {
    public boolean isProduct(int[] arr, long target) {
        // code here
        // Brute Force Approach
        int n = arr.length;
        for(int i =0 ; i< n ; i++){
            for(int j = i+1 ; j< n ; j++){
                long product = arr[i]* arr[j];
                if(product == target) return true;
                
            }
        }
        
        return false;
    }
}


// little optimization we can do the searching in O(log n) using Binary Search

class Solution {
	boolean binarySearch(int arr[], int st, int end, long target) {
		if (st>end) {
			return false;
		}
		int mid = st + (end - st)/2;
		long t = arr[mid];
		if (t == target) {
			return true;
		} else if (t >target) {
			return binarySearch(arr, st, mid - 1, target);
		} else {
			return binarySearch(arr, mid + 1, end, target);
		}
		
	}
	
	public boolean isProduct(int[] arr, long target) {
		// code here
		// Brute Force Approach
		Arrays.sort(arr);
		
		int n = arr.length;
		for (int i = 0 ; i<n ; i++) {
			
			if (arr[i] == 0) {
				
				if (target == 0)
					return true;
				
				continue;
			}
			
			if (target % arr[i] != 0)
				continue;
			
			long comp = target/arr[i];
			if (binarySearch(arr, i + 1, n - 1, comp)) {
				return true;
			}
		}
		
		return false;
	}
}
