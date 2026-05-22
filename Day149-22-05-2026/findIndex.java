class Solution {
	public int findIndex(String s) {
		// code here
		// no. of closing in n-k == no. of opening in 0 to k
		
		// naive approach
		int n = s.length();
		int o_count = 0;
		int ans = n;
		for (int k = 0 ; k<n ; k++) {
			
			int c_count = 0 ;
			
			for (int j = k ; j<n ; j++) {
				if (s.charAt(j) == ')') {
					c_count++;
				}
			}
			
			if (o_count == c_count) {
				return k;
			}
			
			if (s.charAt(k) == '(') {
				o_count++;
			}
		}
		return n;
	}
	
}





// Optimized approach  n time , n space
	class Solution {
	public int findIndex(String s) {
		// code here
		// no. of closing in n-k == no. of opening in 0 to k
		
		// naive approach
		int n = s.length();
		int o_count = 0;
		int c_count = 0 ;
		
		int [] open= new int [n];
		int [] close= new int [n];
		
		for(int i =0 ; i < n ; i++){
		    int j = n-i-1;
		    open[i]= o_count; // because of exclusion of the current , writting before updating
		    if(s.charAt(i)=='('){
		        o_count++;
		    }
		    
		    if(s.charAt(j)==')'){
		        c_count++;
		    }
		    
		    close[j]=c_count;
		}
		
		
		for(int i =0 ; i< n ; i++){
		    if(open[i]== close[i]){
		        return i;
		    }
		}
		
		return n;
		
	}
	
}



// more optimize n time with 1 space
