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
