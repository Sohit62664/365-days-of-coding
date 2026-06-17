class Solution {
	public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
		// code here
		//First approach
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


// most optimal 
class Solution {
	public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
		// code here
		// most optimal approach
		ArrayList<Integer> ans = new ArrayList<>();
		int l1 = a.length;
		int l2 = b.length;
		int l3 = c.length;
		
		int i = 0 ;
		int j = 0 ;
		int k = 0 ;
		while (i < l1 && j<l2 && k < l3) {
			if (a[i] == b[j] && b[j] == c[k]) {
				int last = ans.size();
				if (last == 0) {
					ans.add(a[i]);
				} else if (ans.get(last - 1) != a[i]) {
					ans.add(a[i]);
				}
				i++;
				j++;
				k++;
			} else {
				
				int min = Math.min(a[i], Math.min(b[j], c[k]));
				
				if (a[i] == min)
					i++;
				if (b[j] == min)
					j++;
				if (c[k] == min)
					k++;
			}
		}
		return ans;
		
	}
}
