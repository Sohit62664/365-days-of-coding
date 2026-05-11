class Solution {
	public void reverseArray(int arr[]) {
		// code here
		// using temp array
		
		using two pointers
		int i =0 ;
		int j = arr.length-1 ;
		while(j>i){
		int temp =arr[j];
		arr[j]= arr[i];
		arr[i]= temp;
		    j--;
		    i++;
		}
		return;
		
		// using Single pointer approach
		int n = arr.length;
		for(int i= 0 ; i< n/2 ; i++){
		     int temp =arr[n-i-1];
		    arr[n-i-1]= arr[i];
		    arr[i]= temp;
		}
		return ;
		
		using inbuilt method
		// Collection.reverse(list);
		
		
	}
}
