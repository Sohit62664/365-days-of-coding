class Pair{
    int v ;
    int w ;
    Pair(int v , int w){
        this.v= v ;
        this.w= w ;
    }
}


class Solution {
    public int shortestPath(int V, int src, int dest, int[][] edges) {
        // code here
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        for(int i = 0 ; i< V ; i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            
            adj.get(u).add(new Pair(v , w));
            adj.get(v).add(new Pair(u , w));
        }
        
        
        int [] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        //min Heap
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.w, b.w));
        
        
        dist[src] = 0 ;
        pq.offer(new Pair(src , 0));
        
        
        
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int u = curr.v ;
            int c_dist = curr.w ;
            
            if(c_dist > dist[u]) continue ;
            
            if(u == dest){
                return dist[u];
            }
            
            for (Pair neighbour: adj.get(u)){
                int v = neighbour.v;
                int weight = neighbour.w ;
                
                if(dist[u] != Integer.MAX_VALUE && dist[u]+ weight < dist[v]){
                    dist[v]= dist[u]+ weight ;
                    pq.offer(new Pair(v , dist[v]));
                }
            }
        }
        
        return dist[dest]== Integer.MAX_VALUE ? -1 : dist[dest];
        
    }
    
    
}
