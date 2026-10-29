class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
        // Brute Force 
        
        int res =0 ; 
        int n = arr.length;
        for (int i= 0 ; i< n-k +1; i++){
            if(arr[i] == 0){
                for(int j = i ; j< i+ k  ; j++){
                    arr[j]^=1 ; 
                }
                res++;
            }
        }
        // n - k + 1
        for(int i = 0  ; i< n ; i++){
            if (arr[i] == 0 ) return -1 ;
        }
        return res ; 
    }
}


//optimize code

class Solution {
	public int kBitFlips(int[] arr, int k) {
		// code here
		
		Queue<Integer> q = new ArrayDeque<>();
		int n = arr.length;
		int flips = 0 ;
		
		for (int i = 0 ; i<n ; i++) {
			while (!q.isEmpty() && q.peek() < i - k + 1)
				q.poll();
			
			int value = arr[i] ^ (q.size() % 2);
			
			if (value == 0) {
				// Cannot flip k elements from this position
				if (i + k > n) {
					return - 1;
				}
				
				q.offer(i);
				flips++;
			}
			
		}
		
		
		return flips;
	}
}


