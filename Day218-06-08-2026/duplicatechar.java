//check Duplicates in O(26) 
	boolean duplicate(String sh){
	    boolean [] seen = new boolean[26];
	    
	    for(char ch : sh.toCharArray()){
	        int idx = ch - 'a';
	        if(seen[idx]){
	            return true;
	        }else{
	            seen[idx]= true ;
	        }
	        
	    }
	    
	    return false ;
	}
