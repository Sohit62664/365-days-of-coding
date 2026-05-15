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
    boolean flag = false;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null ) return false;
        helper(root , targetSum, 0);
        return flag;
    }

    void helper(TreeNode root, int targetSum, int sum){
        if(root == null){
            return;
        }
        sum+= root.val;// this would be above becauce first minus the value then check 

        if(sum==targetSum && root.left== null && root.right== null){
            flag = true;
            return;
        }


        
        helper(root.left, targetSum, sum);
        helper(root.right, targetSum , sum);
    }
}



// Note: Read the constraints check the ever possible range of the input 
// in this case negative value 




// wthout using Flag 

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root== null) return false;
        return helper(root , targetSum , 0 );
    }

    boolean helper(TreeNode node , int target , int sum ){
        if(node== null) return false;

        sum += node.val ;

        if(sum == target && node.left == null && node.right == null){
            return true;
        }

        boolean left = helper(node.left , target , sum);
        boolean right  = helper(node.right , target , sum);

        return left|| right;
    }
}
