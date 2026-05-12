// using Hashset

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        
        ArrayList <Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
                ans.add(num);
            }
        }
        
        return ans; 
    }
}


//using HashMap 

class Solution {
	ArrayList<Integer> removeDuplicates(int[] arr) {
		// code here
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int num : arr) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
				ans.add(num);
			}
		}
		
		return ans;
	}
}


//O(1) space 

class Solution {
	ArrayList<Integer> removeDuplicates(int[] arr) {
		// code here
		
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(arr[0]);
		for(int i=1 ; i< arr.length ; i++){
		    if(arr[i]!= arr[i-1]){
		        ans.add(arr[i]);
		    }
		}
		return ans;
	}
}
