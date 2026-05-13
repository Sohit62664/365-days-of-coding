// By the Boyer-Moore Voting Algorithm


class Solution {
    int majorityElement(int arr[]) {
        // code here
        int candidate = -1 ;
        int count = 0 ;
        for(int i= 0 ; i< arr.length ; i++){
            if(count== 0 ){
                candidate = arr[i];
                count = 1 ;
            }else if(candidate == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        
        // verification
        int c = 0;
        for(int num : arr){
            if(num == candidate){
                c++;
            }
        }
        int n= arr.length;
        
        return c>(n/2) ? candidate : -1 ; 
    }
}






// By HashMap 
class Solution {
	int majorityElement(int arr[]) {
		// code here
		HashMap <Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1) ;
		}
		
		int n = arr.length;
		for (int i = 0 ; i<n ; i++) {
			int val = map.get(arr[i]) ;
			if (val>(n/2))
				return arr[i];
		}
		return -1 ;
	}
}


// brute force  
//   count every elment frwuincy and check it is Greter then n/2 
//   takes O(n^2) times
