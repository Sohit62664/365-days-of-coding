class Solution {
    public int longestCycle(int V, int[][] edges) {

        int[] out = new int[V];
        Arrays.fill(out, -1);

        // Build graph
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            out[u] = v;
        }

        int[] visited = new int[V];
        Arrays.fill(visited, 0);

        int ans = -1;

        for (int i = 0; i < V; i++) {
            if (visited[i] == 1) continue;

            HashMap<Integer, Integer> map = new HashMap<>();
            int node = i;
            int step = 0;

            while (node != -1 && visited[node] == 0) {
                visited[node] = 1;
                map.put(node, step++);

                node = out[node];

                if (node != -1 && map.containsKey(node)) {
                    int cycleLength = step - map.get(node);
                    ans = Math.max(ans, cycleLength);
                    break;
                }
            }
        }

        return ans;
    }
}
