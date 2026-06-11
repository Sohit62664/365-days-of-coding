class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Node {
    Pair p;
    int time;

    Node(Pair p, int time) {
        this.p = p;
        this.time = time;
    }
}


class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visited = new boolean[n][m];
        Queue<Node> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Node(new Pair (i,j), 0));
                    visited[i][j]= true;

                }
            }
        }

        int ans = 0;
        while(!q.isEmpty()){
            Node curr = q.poll();
            int i = curr.p.first;
            int j = curr.p.second;
            int time = curr.time;
            ans = Math.max(ans , time);
            if(i-1>=0 && grid[i-1][j]==1 && !visited[i-1][j]){
                q.offer(new Node(new Pair (i-1,j), time+1));
                visited[i-1][j] = true;
            }

            if(i+1<n && grid[i+1][j]==1 && !visited[i+1][j]){
                q.offer(new Node(new Pair (i+1,j), time+1));
                visited[i+1][j] = true;
            }


            if(j-1>=0 && grid[i][j-1]==1 && !visited[i][j-1]){
                q.offer(new Node(new Pair (i,j-1), time+1));
                visited[i][j-1] = true;
            }

            if(j+1 <m && grid[i][j+1]==1 && !visited[i][j+1]){
                q.offer(new Node(new Pair (i,j+1), time+1));
                visited[i][j+1] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    return -1;
                }
            }
        }

        return ans ;
    }
}
