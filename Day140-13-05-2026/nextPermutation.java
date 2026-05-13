Approach
	Find the first decreasing element from right (pivot).
    Find the next greater element from right and swap with pivot.
	Reverse the array after pivot index.


class Solution {
	void nextPermutation(int[] arr) {
		// code here
		// pivot;
		int pi = -1 ;
		int n = arr.length ;
		for (int i = n - 2 ; i >= 0 ; i--) {
			if (arr[i] <arr[i + 1]) {
				pi = i;
				break;
			}
		}
		//
		
		if (pi == -1) {
			for (int i = 0 ; i<n/2 ; i++) {
				swap(arr, i, n - 1-i);
			}
			return ;
		}
		
		
		// next big
		int pv = arr[pi];
		for (int i = n - 1 ; i>pi ; i--) {
			if (arr[i]>pv) {
				swap(arr, pi, i);
				break;
			}
		}
		reverse(arr, pi + 1, n - 1);
		return;
		
	}
	void reverse(int [] arr, int i , int j ){
        while(i<j){
            int temp = arr[j];
            arr[j]= arr[i];
            arr[i]= temp;
            i++;
            j--;
        }
        return;
    }
	void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return ;
	}
	
}
