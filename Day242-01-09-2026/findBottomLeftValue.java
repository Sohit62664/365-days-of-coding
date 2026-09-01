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
    public int findBottomLeftValue(TreeNode root) {
        // left most node val of the last level

        Deque<TreeNode> q = new ArrayDeque<>();
        if(root == null){
            return -1;
        }
        int ans = root.val;
        
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size() ;
            for(int i = 0 ; i< size ; i++){
                TreeNode curr = q.poll();
                if(curr.left!= null){
                    q.offer(curr.left);
                }

                if(curr.right!= null){
                    q.offer(curr.right);
                }
                if(i == 0){
                    ans= curr.val;
                }
            }
        }

        return ans;
    }
}
