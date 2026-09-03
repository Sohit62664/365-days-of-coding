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
    int max = 0 ;
    public int maxDepth(TreeNode root) {
        int depth = 0 ;
        helper(root , depth);
        return max;
    }

    int helper (TreeNode root , int depth){
        if(root == null) return depth ;
        
        int left_hight = helper(root.left , depth+1);
        int right_height = helper(root.right , depth+1);
    
        int dep = Math.max(left_hight , right_height) ;
        
        max = Math.max(dep , max);

        return dep ;
    }
}
