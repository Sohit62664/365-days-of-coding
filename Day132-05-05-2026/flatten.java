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
    Queue<TreeNode> q = new LinkedList<>();
    public void flatten(TreeNode root) {

        if(root == null) return ;
        build(root);
        TreeNode prev = q.poll();

        // TreeNode temp = root;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            prev.left = null;
            prev.right = curr;
            prev = curr;
        }
    }

    void build(TreeNode node ){
        
        if(node == null ) return ;

        q.offer(node);
        build(node.left);
        build(node.right);
    }
}
