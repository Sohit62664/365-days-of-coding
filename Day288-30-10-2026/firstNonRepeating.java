// Brute Force Approach

class Solution {
	public String firstNonRepeating(String s) {
		// code here
		// Brute Force Implimentation
		
		String ans = "";
		int n = s.length();
		HashMap<Character, Integer> map = new HashMap<>();
		char ch [] = s.toCharArray();
		for (int i = 0 ; i < n ; i++) {
			char c = ch[i];
			map.put(c, map.getOrDefault(c, 0) + 1);
			
			boolean flag = true ;
			for (int j = 0 ; j <= i ; j ++) {
				if (map.get(ch[j]) == 1) {
					ans += ch[j];
					flag = false;
					break ;
				}
			}
			
			if (flag) {
				ans += "#";
			}
			
		}
	return ans;
	}
	
	
}





 
//Runniing loop 0n Hashmap  , but complexity is Still O(n^2) becuse of Using the Concatination of the String 
class Solution {
	public String firstNonRepeating(String s) {
		// code here
		// Brute Force Implimentation
		
		String ans = "";
		int n = s.length();
		LinkedHashMap <Character, Integer> map = new LinkedHashMap<>();
		char ch [] = s.toCharArray();
		for (int i = 0 ; i < n ; i++) {
			char c = ch[i];
			map.put(c, map.getOrDefault(c, 0) + 1);
			
			boolean flag = true ;
			
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() == 1) {
					ans += entry.getKey();
					flag = false;
					break;
				}
			}
			
			if (flag) {
				ans += "#";
			}
			
		}
		return ans;
	}
	
}



// More Optimize Code for this 
// O(n*26)

class Solution {
	public String firstNonRepeating(String s) {
		// code here
		// Brute Force Implimentation
		
		StringBuilder ans = new StringBuilder();
		int n = s.length();
		LinkedHashMap <Character, Integer> map = new LinkedHashMap<>();
		char ch [] = s.toCharArray();
		for (int i = 0 ; i < n ; i++) {
			char c = ch[i];
			map.put(c, map.getOrDefault(c, 0) + 1);
			
			boolean flag = true ;
			
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() == 1) {
					ans.append(entry.getKey());
					flag = false;
					break;
				}
			}
						
			if (flag) {
				ans.append("#");
			}
		}
		
		return ans.toString();
	}	
}

