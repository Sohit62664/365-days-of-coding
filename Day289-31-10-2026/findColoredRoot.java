class Solution {
    public int findColoredRoot(int[][] edges, String colors) {
        //making the directed tree
        char ch [] = colors.toCharArray();
        int n = edges.length;
        List<List<Integer>> ls = new ArrayList<>();
        for(int i =0 ; i <= n ;i++){
            ls.add(new ArrayList<>());
        }
        int indegree [] = new int[n+1] ;
        int outdegree [] = new int[n+1];

        for(int i = 0 ; i< n ; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            
            if(ch[x] == 'R' && ch[y] == 'B') ls.get(x).add(y);
            if(ch[y] == 'R' && ch[x] == 'B') ls.get(y).add(x);
            
            if(ch[x] == 'B' && ch[y] == 'W') ls.get(x).add(y);
            if(ch[y] == 'B' && ch[x] == 'W') ls.get(y).add(x);

            if(ch[x] == 'W' && ch[y] == 'R') ls.get(x).add(y);
            if(ch[y] == 'W' && ch[x] == 'R') ls.get(y).add(x);
            
        }


        for(int i =0 ; i<= n ; i++){
            for(int u : ls.get(i) ){
                indegree[u]++;
                outdegree[i]++;
            }
        }


        int in_count = 0 ;
        int ans = 0 ; 

        for(int i =0 ; i<= n ; i++){
            if(indegree[i] == 0){
                in_count++;
                ans= i ;
            }
            if(outdegree[i]>= 3) {
                return -1 ;
            }
            
        }

        if(in_count> 1) {
            return -1 ; 
        }

        return ans ;  
    }
}
