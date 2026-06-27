class Solution {
	public ArrayList<Integer> topoSort(int V, int[][] edges) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		boolean visited [] = new boolean [V] ;
		
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				dfs(i, V, edges, visited, stack);
			}
		}
		
		while (!stack.isEmpty()) {
			ans.add(stack.pop());
		}
		
		return ans ;
		
	}
	
	void dfs(int v, int V, int[][] edges, boolean [] visited, Stack<Integer> stack) {
		visited[v] = true;
		
		for (int[] edge : edges) {
			int u = edge[0];
			int vv = edge[1];
			
			if (u == v) {
				if (!visited[vv]) {
					dfs(vv, V, edges, visited, stack);
				}
			}
		}
		stack.push(v);
	}
}
