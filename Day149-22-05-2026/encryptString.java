// User function Template for Java

class Solution {
	static String encryptString(String S) {
		// code here
		int count = 1 ;
		int n = S.length();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1 ; i<n ; i++) {
			char curr = S.charAt(i);
			char pre = S.charAt(i - 1);
			
			if (pre == curr) {
				count++;
			} else {
				sb.append(pre);
				sb.append(converter(count));
				count = 1;
			}
		}
		
		sb.append(S.charAt(n - 1));
		sb.append(converter(count));
		int i = 0;
		int j = sb.length() - 1;
		
		while (i < j) {
			char temp = sb.charAt(i);
			
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, temp);
			
			i++;
			j--;
		}
		
		return sb.toString();
	}
	static String converter(int num) {
		if (num >= 0 && num <= 9) {
			return Integer.toString(num);
		} else if (num >= 10 && num <= 15) {
			return hex(num);
		} else {
			
			StringBuilder sb = new StringBuilder();
			helper(num, sb);
			return sb.toString();
		}
		
	}
	
	static String hex(int ch) {
		if (ch == 10)
			return "a" ;
		if (ch == 11)
			return "b" ;
		if (ch == 12)
			return "c" ;
		if (ch == 13)
			return "d" ;
		if (ch == 14)
			return "e" ;
		if (ch == 15)
			return "f" ;
		
		return " ";
	}
	
	static void helper(int num, StringBuilder sb) {
		while (num != 0) {
			int rem = num % 16;
			num /= 16 ;
			sb.append(converter(rem));
		}
	}
};






// Approach 2 

// User function Template for Java

class Solution {

    static String encryptString(String S) {

        int n = S.length();
        int count = 1;

        StringBuilder ans = new StringBuilder();

        for(int i = 1; i < n; i++) {

            if(S.charAt(i) == S.charAt(i - 1)) {
                count++;
            }
            else {

                ans.insert(0, Integer.toHexString(count) + S.charAt(i - 1));

                count = 1;
            }
        }

        
        ans.insert(0, Integer.toHexString(count) + S.charAt(n - 1));

        return ans.toString();
    }
}
