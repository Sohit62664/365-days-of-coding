class Solution {
	public char nonRepeatingChar(String s) {
		// code here
		// Brute force
		int n = s.length();
		for (int i = 0 ; i<n ; i++) {
			
			boolean found = false;
			char ch = s.charAt(i);
			
			for (int j = 0 ; j<n ; j++) {
				if (i != j && ch == s.charAt(j)) {
					found = true;
				}
			}
			if(!found){
			    return  ch;
			}
		}
		
		return '$';
	}
}


// now how to optimize it 
