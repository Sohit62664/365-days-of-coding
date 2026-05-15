class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
		int [] suff = new int[n];
		int [] pre = new int[n];
		
		int p = 1 ; 
		int s = 1 ; 
		pre[0]=1;
		suff[n-1]= 1 ;
		for(int i =0 ; i< n-1; i++){
		    pre[i+1]= arr[i]*p;
		    suff[n-i-2]= arr[n-1-i]*s;
		    
		    p = pre[i+1];
		    s= suff[n-i-2];
		}
		
		
		for(int i=0 ; i< n ; i++){
		    arr[i]= pre[i]* suff[i];
		}
		
		
		return arr;
    }
}







class Solution {
	public static int[] productExceptSelf(int arr[]) {
		// code here
		// by Array Preprocessing or Suffix-prefix Approach
		int n = arr.length;
		int [] suff = new int[n];
		int [] pre = new int[n];
		
		int s = 1 ;
		int p = 1 ;
		for (int i = 0 ; i <n ; i++) {
			int a = arr[i];
			int b = arr[n - i-1];
			s *= a;
			suff[i] = s ;
			p *= b;
			pre[n - i-1] = p;
		}
		
		int left =1 , right = 1;
		for (int i = 0 ; i<n ; i++) {
			if (i != 0) {
				left = suff[i - 1];
			}
			
			if (i != n - 1) {
				right = pre[i + 1];
			}
			
			arr[i] = left * right;
			left = 1;
			right = 1;
		}
		
		return arr;
		
	}
}


class Solution {
	public static int[] productExceptSelf(int arr[]) {
		// code here
		// by Array Preprocessing or Suffix-prefix Approach
		
// 		check the suffix , prefix naming 
		int n = arr.length;
		int [] suff = new int[n];
		int [] pre = new int[n];
		
		int s = 1 ;
		int p = 1 ;
		suff[0] = 1 ;
		pre[n - 1] = 1 ;
		for (int i = 1; i <n ; i++) {
			int a = arr[i-1];
			int b = arr[n - i];
			s *= a;
			suff[i] = s ;
			p *= b;
			pre[n - i-1] = p;
			
		}
		
		for (int i = 0 ; i<n ; i++) {
			arr[i] = pre[i]* suff[i];
		}
		
		return arr;
		
	}
}
