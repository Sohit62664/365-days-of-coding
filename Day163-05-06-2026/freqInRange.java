class Solution {
	public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
		// code here
		// broute force is simple a loop  on Query
		// then start a loop from lt o r and count x and store
		// as per the constraints it's not gonna work
		
		ArrayList < Integer> ans = new ArrayList<>();
		
		for (int[] q : queries) {
			int l = q[0];
			int r = q[1];
			int x = q[2];
			int count = 0;
			for (int i = l ; i <= r ; i++) {
				if (arr[i] == x) {
					count++;
				}
			}
			
			ans.add(count);
		}
		
		return ans;
	}
}




// optimized approach using binary search /

class Solution {
	public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
		// code here
		// broute force is simple a loop  on Query
		// then start a loop from lt o r and count x and store
		// as per the constraints it's not gonna work
		
		ArrayList < Integer> ans = new ArrayList<>();
		
		// 		for (int[] q : queries) {
		// 			int l = q[0];
		// 			int r = q[1];
		// 			int x = q[2];
		// 			int count = 0;
		// 			for (int i = l ; i <= r ; i++) {
		// 				if (arr[i] == x) {
		// 					count++;
		// 				}
		// 			}
		
		// 			ans.add(count);
		// 		}
		
		// 		return ans;
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(); // storing the valua and it's indiceases
		
		for (int i = 0; i < arr.length; i++) {
			map.putIfAbsent(arr[i], new ArrayList<>());
			map.get(arr[i]).add(i);
		}
		
		for (int[] q : queries) {
			
			int l = q[0];
			int r = q[1];
			int x = q[2];
			
			if (!map.containsKey(x)) {
				ans.add(0);
				continue;
			}
			
			ArrayList<Integer> pos = map.get(x);
			
			int left = lowerBound(pos, l);
			int right = upperBound(pos, r);
			
			ans.add(right - left);
		}
		
		
		return ans;
	}
	
	private int lowerBound(ArrayList<Integer> arr, int target) {
		
		int low = 0;
		int high = arr.size();
		
		while (low < high) {
			
			int mid = low + (high - low) / 2;
			
			if (arr.get(mid) >= target)
				high = mid;
			else
				low = mid + 1;
		}
		
		return low;
	}
	
	private int upperBound(ArrayList<Integer> arr, int target) {
		
		int low = 0;
		int high = arr.size();
		
		while (low < high) {
			
			int mid = low + (high - low) / 2;
			
			if (arr.get(mid) > target)
				high = mid;
			else
				low = mid + 1;
		}
		
		return low;
	}
}
