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
    private boolean balanced;
    
    private int dfs(TreeNode node){
        if (node == null)
            return 0;
        int l = dfs(node.left);
        int r = dfs(node.right);
        if (Math.abs(l - r) > 1)
            balanced = false;
        return Math.max(l, r) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        balanced = true;
        dfs(root);
        return balanced;
    }
}