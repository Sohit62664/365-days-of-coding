class Solution {
	public static String minWindow(String s, String p) {
		// code here
		int[] window = new int[26];
		int[] og_window = new int[26];
		
		for (char c : p.toCharArray()) {
			int index = c - 'a';
			og_window[index] ++;
		}
		
		int left = 0 ;
		int min = Integer.MAX_VALUE;
		int id1 = 0 ;
		int id2 = 0 ;
		
		// 		boolean valid = valid_window( og_window  , s , k);
		
		int st = p.length() ;
		int end = s.length() - 1;
		int k = 0 ;
		while (st<=end) {
			int mid = st + (end - st) / 2 ;
			
			boolean valid = valid_window(og_window, s, mid);
			if (valid)
				k = mid ;
			
			if (valid) {
				end = mid-1;
			} else {
				st = mid + 1;
			}
		}
		
		return search(og_window, s, k);
		
	}
	
	static	boolean valid_window(int [] og_window, String s, int k) {
		int left = 0 ;
		int[] window = new int[26];
		
		for (int right = 0 ; right<s.length() ; right++) {
			window[s.charAt(right) - 'a']++;
			
			while (right - left + 1 >k) {
				window[s.charAt(left) - 'a']--;
				left++;
			}
			
			boolean c_valid = true;
			if (right - left + 1 == k) {
				for (int i = 0 ; i < 26 ; i++) {
					if (window[i] < og_window[i]) {
						c_valid = false ;
						break;
					}
				}
				if (c_valid) {
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	static	String search(int [] og_window, String s, int k) {
		int left = 0 ;
		int[] window = new int[26];
		
		for (int right = 0 ; right<s.length() ; right++) {
			window[s.charAt(right) - 'a']++;
			
			while (right - left + 1 >k) {
				window[s.charAt(left) - 'a']--;
				left++;
			}
			
			boolean c_valid = true;
			if (right - left + 1 == k) {
				for (int i = 0 ; i < 26 ; i++) {
					if (window[i] < og_window[i]) {
						c_valid = false ;
						break;
					}
				}
				if (c_valid) {
					return s.substring(left, right + 1);
				}
				
			}
		}
		
		return "";
		
	}
}
