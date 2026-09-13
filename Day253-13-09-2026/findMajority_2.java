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

