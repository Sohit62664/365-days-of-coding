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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<Integer> list = new ArrayList<>();
        if(root == null ) return ans;
        helper(root , targetSum, 0 , list);
        return ans;
    }

    void helper(TreeNode root, int targetSum, int sum , List<Integer> list ){
        if(root == null){
            return;
        }

        sum+= root.val;
        list.add(root.val);
        if(sum==targetSum && root.left== null && root.right== null){
            ans.add(new ArrayList<>(list));        
        }
        
        helper(root.left, targetSum, sum,list);
        // sum -= root.val;
        
        helper(root.right, targetSum , sum,list);
        list.remove(list.size()-1);
    }
}
