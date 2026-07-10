class Pair{
    int node , dist ; 
    
    Pair( int node , int dist){
        this.node = node ;
        this.dist = dist ;
    }
}


class Solution {
	public int[] dijkstra(int V, int[][] edges, int src) {
		
		// Converting the edges to the adjacency list ? ->  we can't efficiently find neighbors of a node from a flat edge list.
		
		List<List<int[]>> adj = new ArrayList<>();
		
		for (int i = 0 ; i<V ; i++) {
			adj.add(new ArrayList<>());
		}
		
		for (int [] edge : edges) {
			int u = edge[0], v = edge[1], w = edge[2];
			adj.get(u).add(new int [] {v, w});
			adj.get(v).add(new int [] {u, w});
		}
		
		
		int dist [] = new int[V];

        Arrays.fill(dist , Integer.MAX_VALUE);

        dist[src] =  0 ; 

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        pq.offer(new Pair(src , 0));
        
        
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            
            int u = curr.node; 
            int d = curr.dist;
            
            
            if(d > dist[u]) continue;
            
            for(int [] neighbour : adj.get(u)){
                int v = neighbour[0];
                int weight = neighbour[1];
                
                if(dist[u] + weight < dist[v]){
                    dist[v] = dist[u] + weight ;
                    
                    pq.offer(new Pair(v , dist[v]));
                }
            }
            
        }
        
		return dist ;
		
	}
}
