
class Solution {
	int minOperations(int[] b) {
		// code here
		// operation
		long count = 1 ;
		
		int mod = 1_000_000_007;
		
		int a[] = new int [b.length];
		for(int i = 0 ; i< b.length  ; i++){
		    a[i]= i+1;
		}
		
	    while(!op(a, b)){
	        count = (count+ 1) % mod ;
	    }
	    if (count == 0 ) return 1 ;
	    return  (int) count ;
	}
	
	 boolean op(int[] a, int[] b) {
		int[] ans = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			ans[b[i] - 1] = a[i];
		}
		for(int i =0 ; i< a.length ; i++){
		    a[i]= ans[i];
		}
		
		for(int i =0 ; i< a.length ; i++){
		    if(ans[i]!= i+1) return false;
		}
		
		return true ;
	}
	
	
	
};
