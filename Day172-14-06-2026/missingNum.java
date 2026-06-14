class Solution {
    int missingNum(int arr[]) {
        // code here
        // total numbers = n
        // Brute Force
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr ){
            set.add(num);
            
        }
        int n = arr.length;
        
        for(int i = 1 ; i<= n+1 ; i++){
            if(!set.contains(i)){
                return i ;
            }
        }
        
        return -1 ;
    }
}


// Optimal
class Solution {
	int missingNum(int arr[]) {
		// code here
		int n = arr.length;
		n++;
		
		long sum = (long)n * (n + 1) / 2; // ast issue was integer Overflow
		
		n--;
		
		long a_sum = 0 ;
		
		for(int num : arr){
		    a_sum+=num;
		}
		int ans = (int)(sum - a_sum);
		return ans;
	}
}





class Solution {
    int missingNum(int arr[]) {
        // code here
        // O(n^2);
        // linear Seearch 
        
        
        int n= arr.length;
        
        for(int i =1 ; i <= n+1; i++){
            if(!search(arr , i)){
                return i;
            }
        }
        
        return -1 ;
    }
    
    boolean search(int [] arr , int k ){
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i]== k){
                return true;
            }
        }
        return false;
    }
}
