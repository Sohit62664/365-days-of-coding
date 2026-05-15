// User function Template for Java
class Solution {
	
	public List<Integer> findSplit(int[] arr) {
		// Return an array of possible answer, driver code will judge and return true or
		// false based on
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(-1);
		list1.add(-1);
		List<Integer> list2 = new ArrayList<>();
		
		int total_sum = 0 ;
		
		for (int num : arr) {
			total_sum += num;
		}
		
		if (total_sum%3 != 0) {
			return list1 ;
		}
		
		int sum = total_sum/3;
		
		int idx1 = -1;
		int idx2 = -1;
		int temp = 0 ;
		for (int end = 0 ; end<arr.length-1 ; end++) {
			temp += arr[end];
			
			if (temp == sum && idx1 == -1) {
				idx1 = end;
			}
			
			else if (temp == 2*sum && idx1 != -1) {
			    idx2=end;
				break;
			}
			
		}
		if (idx2 == arr.length - 1) {
			return list1 ;
		}
		
		if (idx1 != -1 && idx2 != -1) {
			list2.add(idx1);
			list2.add(idx2);
			return list2;
		}
		
		
		return list1;
		
	}
}
