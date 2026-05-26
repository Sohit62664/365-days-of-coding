class Solution {
	public String colName(int n) {
		// code here
		StringBuilder ans = new StringBuilder();
		String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		
		
		while (n>0) {
			int rem = n%26;
			if(rem == 0 ){
			    ans.append("Z");
			    n/=26;
			    n--;
			}else{
			    ans.append(alpha[rem-1]);
			    n/=26;
			}
			
		}
		
		return ans.reverse().toString();
	}
}
