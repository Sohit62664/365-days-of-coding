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
    public void flatten(TreeNode root) {
        helper(root);
    }

    void helper(TreeNode root) {

        if (root == null)
            return;
        if (root.left != null) {

            TreeNode left_node = root.left;
            while (left_node.right != null) {
                left_node = left_node.right;
            }

            left_node.right = root.right;
            root.right = root.left;
            
        helper(root.left);
            root.left = null;
        }
            helper(root.right);
    }
}
