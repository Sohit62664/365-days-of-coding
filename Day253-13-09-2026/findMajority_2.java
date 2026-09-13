class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        // naive approach O(n^2);
        
        
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); // Handeling Duplicates
        
        int n = arr.length ; 
        
        for(int i=0 ; i< n ; i++){
            int f = 0 ;
            int num = arr[i];
            if(set.contains(num)){
                continue;
            }
            for(int j = 0 ; j< n ; j++){
                if(num== arr[j]){
                    f++;
                }
            }
            set.add(num);
            if(f>(n/3)){
                result.add(num);
            }
        }
        
        Collections.sort(result);
        
        return result;
    }
}




// Optimized approach 

    class Solution {
	public ArrayList<Integer> findMajority(int[] arr) {
		// code here
		
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for (int num : map.keySet()) {
			int f = map.get(num);
			
			if (f>(n/3)) {
				result.add(num);
			}
		}
		Collections.sort(result);
		
		return result;
	}
}




//More Optimized Boyer-Moors algo 


class Solution {
	public ArrayList<Integer> findMajority(int[] arr) {
		// code here
		int n = arr.length;
		ArrayList<Integer> result = new ArrayList<>();
		
		int el1 = -1;
		int el2 = -1;
		
		int cnt1 = 0 ;
		int cnt2 = 0 ;
		
		for (int num : arr) {
			
			if (num == el1) {
				cnt1++;
			} else if (num == el2) {
				cnt2++;
			} else
			
			if (cnt1 == 0) {
				el1 = num ;
				cnt1++;
				
			} else if (cnt2 == 0) {
				cnt2++;
				el2 = num ;
			} else {
				cnt1--;
				cnt2--;
			}
		}
		
		int f1 = 0 ;
		int f2 = 0 ;
		
		for (int num : arr) {
			if (num == el1) {
				f1++;
			}
			if (num == el2) {
				f2++;
			}
			
		}
		
		if (f1 > arr.length/3) {
			result.add(el1);
		}
		if (f2 > arr.length/3) {
			result.add(el2);
		}
	    
	    Collections.sort(result);
	    
		return result;
		
		
	
	}
}
