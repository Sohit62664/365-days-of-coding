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

        if (root == null)
            return ans;
        List<Integer> ls = new ArrayList<>();
        treverse(root , targetSum , ls);

        return ans ;
    }

    void treverse(TreeNode root , int sum , List<Integer> ls){
        if(root == null){
            return ;
        }
        
        ls.add(root.val);
        sum -= root.val ;
        System.out.println(root.val);
        if(root.left == null && root.right == null  && sum == 0 ){
            List<Integer> l = new ArrayList<> ();
            for(int num : ls){
                l.add(num);
            }
            ans.add(l);
            // return;
        }
        

        if(root.left!= null){
            treverse(root.left , sum , ls);
        }

        if(root.right!= null) {
            treverse(root.right , sum , ls);
        }
        ls.remove(ls.size()-1);
    }
}
