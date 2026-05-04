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
class Solution {
    
    public boolean isCousins(TreeNode root , int x , int y){
        if(root== null) return false;
        boolean sibling = false ; 
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;
        int x_level = -1;
        int y_level = -1;
        while(!q.isEmpty()){
            int size= q.size();
            for(int i =0 ; i< size ; i++){
                TreeNode node = q.poll();
                if(node.val== x){
                    x_level= level; 
                }

                if(node.val== y){
                    y_level= level; 
                }

                if(node.left!= null) q.offer(node.left);
                if(node.right != null ) q.offer(node.right);

                if(node.left!= null && node.right != null ){
                if((node.left.val == x && node.right.val ==y) || (node.left.val == y && node.right.val ==x)) sibling = true ;}
                
            }
            level++;
        }

        if(!sibling && (x_level == y_level)){
            return true;
        }else{
            return false;
        }
    }
}
