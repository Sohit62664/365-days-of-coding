class Solution {
	public static boolean checkPangram(String s) {
		// code here
		// set
		// check by ascaii
		
		HashSet<Character> set = new HashSet<>();
		
		for (int i = 0 ; i<s.length(); i++) {
			if (s.charAt(i) != ' ') {
				char ch = Character.toLowerCase(s.charAt(i));
				if (ch >= 'a' && ch <= 'z') {
					set.add(ch);
				}
			}
		}
		
		if (set.size() == 26) {
			return true;
		} else {
			return false;
		}
	}
}
