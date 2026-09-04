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
    Queue<TreeNode> q = new ArrayDeque<>();

    public void flatten(TreeNode root) {
        // Brute orce Spproach 
        // treverse and store inoo queuee and then make the tree 

        if(root == null ) return ; 

        //preOrder Treversl 
        helper(root);

        TreeNode curr = root ;
        
        q.poll();
        while(!q.isEmpty()){
            curr.right= q.poll();
            curr.left = null;
            curr = curr.right;
        }

        return ;
    }

    void helper(TreeNode root) {
        if (root == null)
            return;

        q.offer(root);

        helper(root.left);
        helper(root.right);
    }
}
