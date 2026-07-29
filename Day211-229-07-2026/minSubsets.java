
class Solution {
    int minSubsets(int arr[]) {
        // code here
	Arrays.sort(arr) ;
	int count = 1 ; 
	for(int  i = 1 ; i< arr.length ; i++){
		if(arr[i]!=arr[i-1]+1) count++;
	}
	return count;
    }
}




//optimize Approach


class Solution {
    int minSubsets(int arr[]) {
        // code here
        // O(n) Approach
        HashSet<Integer>  set = new HashSet<>();
        int count = 0 ;
        
        
        
        
        for(int i =0 ; i< arr.length ; i++){ //index variable i of the loop
            set.add(arr[i]);
        }
        
        for(int num : set ){
            if(!set.contains(num-1)) count++;
        }
        
        return count;
        
        
        
    }
}
