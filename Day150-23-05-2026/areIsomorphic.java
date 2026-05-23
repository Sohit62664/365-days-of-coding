class Solution {
	public boolean areIsomorphic(String s1, String s2) {
		// code here
		if(s1.length()!= s2.length()) return false;
		int n= s1.length();
		
		HashMap<Character, Character> map = new HashMap<>();
		//  s1->s2
		for(int i=0 ; i< n ; i++){
		    char a = s1.charAt(i);
		    char b = s2.charAt(i);
		    
		    if(map.containsKey(a)){
		        if(map.get(a)!= b){
		            return false;
		        }
		    }else{
		        map.put(a,b);
		    }
		}
		
		
		HashMap<Character, Character> map2 = new HashMap<>();
		// s2->s1
		
		
		for(int i=0 ; i< n ; i++){
		    char a = s1.charAt(i);
		    char b = s2.charAt(i);
		    
		    if(map2.containsKey(b)){
		        if(map2.get(b)!= a){
		            return false;
		        }
		    }else{
		        map2.put(b,a);
		    }
		}
		return true;
		
	}
}
