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
// 1. using freq map

class Solution {
	public char nonRepeatingChar(String s) {
		// code here
		// Brute force
		int n = s.length();
		HashMap<Character , Integer> map = new HashMap<>();
		
		
		for(int i = 0 ; i< n ; i++){
		    char ch = s.charAt(i);
		    map.put(ch , map.getOrDefault(ch,0)+1);
		}
		
		for(int i = 0 ; i< n ; i++){
		    char ch = s.charAt(i);
		    if(map.get(ch)== 1){
		        return ch;
		    }
		}
		
		
		return '$';
	}
}




// 2 using Frequency array  most optimal because only 26 characters
class Solution {
    static char nonRepeatingChar(String s) {
        
        int[] freq = new int[26];
        
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(freq[ch - 'a'] == 1){
                return ch;
            }
        }
        
        return '$';
    }
}

















