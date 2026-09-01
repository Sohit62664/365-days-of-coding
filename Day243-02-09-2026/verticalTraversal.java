/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class Touple{
    TreeNode node ;
    int row ;
    int col;

    Touple(TreeNode node , int row  , int col){
        this.node = node ;
        this.row = row ;
        this.col = col ; 
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        // We are using TreeMap since we need to maintain the sorted order of keys
        // map(Vertical , map(level , pq))  // if same vertical but diff level then order in level bise so use treemap if same vertical , same level then used pq to maintain the sorted orde

        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map = new TreeMap<>();


        Deque<Touple> q = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        q.offer(new Touple(root , 0 , 0));

        while(!q.isEmpty()){
            // poll  first
            Touple t = q.poll();
            TreeNode node = t.node ; 
            int row = t.row ;
            int col = t.col;

            // Prepare the map to store
            if(!map.containsKey(row)){
                map.put(row , new TreeMap<>());
            }

            if(!map.get(row).containsKey(col)){
                map.get(row).put(col , new PriorityQueue<>());
            }

            // now store the val in the map 
            map.get(row).get(col).offer(node.val);


            //now offer the childre in the queue;
            if(node.left!= null){
                q.offer(new Touple(node.left , row-1 , col+1));
            }
            if(node.right!= null){
                q.offer(new Touple(node.right, row+1 , col+1));
            }
        }

        //Retrive the data from the map 

        for(TreeMap<Integer, PriorityQueue<Integer>> v_nodes : map.values()){
            List<Integer> ls = new ArrayList<>();
            
            for(PriorityQueue<Integer> pqs : v_nodes.values()){
                //store all the pqs value into the list , order is already maintained by treemap and pq 
                while(!pqs.isEmpty()){
                    ls.add(pqs.poll());
                }
            }
            ans.add(ls);
        }

        return ans;
    }
}
