class Solution {
    public int find(int[] arr) {
        // code here
        // Brute force approach 
        // Arrays.sort(arr); flop 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            max =  Math.max(max , arr[i]);
        }
        
        for(int v  = 0 ; v <= max ; v++){
            int x = v ;
            for(int i= 0 ; i < arr.length ; i++ ){
                    int y = arr[i];
                    x = x - (y - x);
                    if(x<0){
                        break ;
                    }
                    
                    if(i == (arr.length -1 ) && x>=0 ){
                        pq.offer(v);
                    }
                
            }
        }
        
        if(!pq.isEmpty()) return pq.poll();
        
        return -1;
        
    }
}



// using binary search 


class Solution {
	public int find(int[] arr) {
		// code here
		// Brute force approach
		// Arrays.sort(arr); flop
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int max = 0 ;
		for (int i = 0 ; i<arr.length ; i++) {
			max = Math.max(max, arr[i]);
		}
		
		int low = 1;
		int high = max;
		int ans = high;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (check(mid, arr)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return ans;
		
	}
	
	boolean check(int x, int[] arr) {
		long curr = x;
		
		for (int a : arr) {
			curr = 2 * curr - a;
			if (curr < 0)
				return false;
		}
		return true;
	}
}






// O(n) Solution
class Solution {
    public int find(int[] arr) {
        long ans = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            ans = (ans + arr[i] + 1) / 2;
        }

        return (int) ans;
    }
}
