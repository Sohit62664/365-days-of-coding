class Solution {
	public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
		// code here
		ArrayList<Integer> list = helper(a, b);
		int [] d = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			d[i] = list.get(i);
		}
		
		ArrayList<Integer> ans = helper(d, c);
		
		return ans;
		
	}
	
	ArrayList<Integer> helper(int [] a, int [] b) {
		int l1 = a.length;
		int l2 = b.length;
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0 ;
		int j = 0 ;
		while (i<l1 && j <l2) {
			
			if (a[i] == b[j]) {
				if (!set.contains(a[i])) {
					ans.add(a[i]);
					set.add(a[i]);
				}
				
				i++;
				j++;
			} else if (a[i]<b[j]) {
				i++;
			} else {
				j++;
			}
		}
		
		return ans;
	}
}
