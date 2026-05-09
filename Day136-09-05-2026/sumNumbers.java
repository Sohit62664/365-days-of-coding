// solution 02 
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
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    int helper(TreeNode root , int sum){
        if(root == null ) return 0 ;
        sum = sum*10 +root.val;
        if(root.left == null && root.right == null){
            return sum;
        }

        return helper(root.left , sum )+ helper(root.right, sum);
    }
}









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
    ArrayList<Integer> list = new ArrayList<>();
    
    public int sumNumbers(TreeNode root) {
        helper(root , 0);

        int sum = 0;
        for(int i : list){
            sum+=i;
        }
        return sum;
    }

    void helper(TreeNode root , int num){
        if(root == null ) return ;

        num = (num*10 )+ root.val;
        if(root.left== null && root.right == null ){
            list.add(num);
            return;
        }

        helper(root.left, num);
        helper(root.right, num);
    }
}
