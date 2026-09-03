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
    public TreeNode invertTree(TreeNode root) {
        // TreeNode node = root;

        inverter(root);

        return root;
    }

    void inverter(TreeNode root){
        if(root == null){
            return ;
        }
        inverter(root.left);
        // TreeNode left = ;
        // TreeNode right= root.right;
        inverter(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}

// Here We are using Postorder why?
// the Reason is - first we want to process left and right then go to the root
