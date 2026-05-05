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
    int max_depth = 0 ;
    public int maxDepth(TreeNode root) {
        if(root == null ) return 0 ;
        depth(root);
        return max_depth+1;
    }

    int depth(TreeNode root){
        if(root== null) return 0;

        int l = depth(root.left);
        int r = depth(root.right);

        int dia= Math.max(l , r);
        max_depth= Math.max(dia , max_depth);

        return dia+1;
    }
}
