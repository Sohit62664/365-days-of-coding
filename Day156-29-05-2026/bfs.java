class Solution {
	public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
		// code here
		int V = adj.size();
		Queue<Integer> q = new LinkedList<>();
		boolean visited [] = new boolean [V];
		
		q.offer(0);
		visited[0] = true ;
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(!q.isEmpty()){
		    int u = q.poll();
		    ans.add(u);
		    
		    for(int v : adj.get(u)){
		        if(!visited[v]){
		            visited[v]= true ;
		            q.offer(v);
		        }
		    }
		}
		
		return ans;
		
	}
}
