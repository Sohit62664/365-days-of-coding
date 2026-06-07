class Solution {
	public String profession(int level, int pos) {
		// code here
		
		ArrayList<String> ans = new ArrayList<>();
		
		Queue<String> q = new LinkedList<>();
		
		for (int l = 0 ; l < level ; l++) {
			int positions = (int)Math.pow(2, l);
			
			for (int p = 0 ; p < positions ; p++) {
				if (l == 0) {
					q.offer("Engineer");
					String st = q.poll();
					if (st.equals("Engineer")) {
						q.offer("Engineer");
						q.offer("Doctor");
					} else {
						q.offer("Doctor");
						q.offer("Engineer");
					}
					
					if (l == level - 1) {
						ans.add(st);
					}
					
				} else {
					String st = q.poll();
					if (st.equals("Engineer")) {
						q.offer("Engineer");
						q.offer("Doctor");
					} else {
						q.offer("Doctor");
						q.offer("Engineer");
					}
					
					if (l == level - 1) {
						ans.add(st);
					}
				}
			}
		}
		
		return ans.get(pos - 1);
	}
}



// Optimize Recursive Approach

class Solution {
	
	// static boolean flag = true;
	public String profession(int level, int pos) {
		// code here
		
		return helper(level, pos);
		
	}
	static String helper(int level, int pos) {
		if (pos == 1) {
			return "Engineer";
		}
		String parent = helper(level - 1, (pos + 1)/2);
		
		if (pos%2 == 0) {
			return opp(parent);
		} else {
			return parent;
		}
		
	}
	
	static String opp(String Parent) {
		if (Parent.equals("Engineer")) {
			return "Doctor";
		} else {
			return "Engineer";
		}
		
	}
}
