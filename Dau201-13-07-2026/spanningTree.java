class Solution {
	public int spanningTree(int V, int[][] edges) {
		
		ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
		
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		
		for (int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			int w = edge[2];
			
			adj.get(u).add(new int[] {v, w});
			adj.get(v).add(new int[] {u, w});
		}
		
		PriorityQueue<int[]> pq = new PriorityQueue<>(
		(a, b) -> Integer.compare(a[0], b[0]));
		
		boolean[] mst = new boolean[V];
		
		int minSum = 0;
		
		pq.offer(new int[] {0, 0});
		
		while (!pq.isEmpty()) {
			
			int[] cur = pq.poll();
			
			int wt = cur[0];
			int node = cur[1];
			
			if (mst[node])
				continue;
			
			mst[node] = true;
			minSum += wt;
			
			for (int[] next : adj.get(node)) {
				
				int neighbour = next[0];
				int edgeWeight = next[1];
				
				if (!mst[neighbour]) {
					pq.offer(new int[] {edgeWeight, neighbour});
				}
			}
		}
		
		return minSum;
	}
}
