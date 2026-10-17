class Solution {
	public boolean isItPossible(String s1, String s2) {
		// code here
		// 		if (s1.length() != s2.length())
		// 			return false;
		
		String ss1 = operationb(s1);
		String fs1 = operationa(ss1);
		String ss2 = operationb(s2);
		String fs2 = operationa(ss2);
		
	    if(fs1.equals(fs2)){
	        return true ;
	    }else{
	        return false;
	    }
		
	}
	
	// 	String operationb(String s) {
	// 		char [] sh = s.toCharArray();
	// 		int n = s.length();
	// 		int i = n - 1;
	// 		int j = n - 1;
	
	// 		while (j >= 0 && i >= 0) {
	// 			if (sh[j] == 'B') {
	// 				sh[i] = 'B';
	// 				sh[j] = '#';
	// 				i--;
	// 			}
	
	// 			if(sh[j] == 'A'){
	// 			    i= j-1 ;
	// 			}
	// 			j--;
	// 		}
	
	// 		return new String(sh);
	// 	}
	
	String operationb(String s) {
		char[] sh = s.toCharArray();
		int i = sh.length - 1;
		
		for (int j = sh.length - 1; j >= 0; j--) {
			if (sh[j] == 'A') {
				i = j - 1;
			} else if (sh[j] == 'B') {
				if (i != j) {
					sh[i] = 'B';
					sh[j] = '#';
				}
				i--;
			}
		}
		
		return new String(sh);
	}
	String operationa(String s) {
		char[] sh = s.toCharArray();
		int i = 0;
		
		for (int j = 0; j < sh.length; j++) {
			if (sh[j] == 'B') {
				i = j + 1;
			} else if (sh[j] == 'A') {
				if (i != j) {
					sh[i] = 'A';
					sh[j] = '#';
				}
				i++;
			}
		}
		
		return new String(sh);
	}
};
