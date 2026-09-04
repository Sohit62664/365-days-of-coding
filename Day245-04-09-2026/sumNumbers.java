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
    int sum = 0 ; 
    public int sumNumbers(TreeNode root) {
        // sum = 0 ;
        if(root == null) return 0 ; 
        helper(root , 0);
        return sum;
    }

    void helper(TreeNode root , int number){
        if(root == null) {
            // sum+= number; // it is adding two times beecause of left and right 
            return ;
        }
        number *= 10 ;
        number += root.val;
        if(root.left== null && root.right== null) {
            sum+= number;
            return;
        }

        
        helper(root.left , number);
        helper(root.right , number);

    }
}
