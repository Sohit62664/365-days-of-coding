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



// Approach 2 


class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        int n= s1.length();
        
        boolean []  marked= new boolean[26];
        
        int [] map = new int[26];
        
        
        for(int i=0  ; i< 26 ; i++){
            map[i]= -1;
        }
        
        for(int i= 0 ; i< n ; i++){
            int u = s1.charAt(i)-'a';
            int v = s2.charAt(i)-'a';
            
            if(map[u]==-1){
                
                if(marked[v]) return false;
                
                map[u]= v ;
                marked[v]= true;
            }else if(map[u] != v){
                return false;
            }
        }
        return true;
    }
}
