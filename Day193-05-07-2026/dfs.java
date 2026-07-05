// package Day193-05-07-2026;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class dfs {
    void dfs(int start , ArrayList<ArrayList<Integer>> adj , int V){
        boolean  visited [] = new boolean  [V];
        Queue<Integer> q = new ArrayDeque<>() ;

        visited[start] = true ;
        q.offer(start);

        while(!q.isEmpty()){
            int val = q.poll();
            System.out.println(val);
            for(int neigh : adj.get(val)){
                if(!visited[neigh]){
                    visited[neigh] = true ; 
                    q.offer(neigh) ;
                }
            }
        }
    }
}
