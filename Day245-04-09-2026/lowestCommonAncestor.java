First Thinking Approach 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean found = false;
    // TreeNode ans  = new TreNode();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null ) return root ;
        if(found) return root;

        TreeNode left = lowestCommonAncestor(root.left , p , q);
        TreeNode right = lowestCommonAncestor(root.right , p , q);


        if(left== p && right == q){
            found = true;
            // ans = root;
            return root;
        }

        // if() return root;
        if(root == p &( root.left == q ||root.right == q  )){
            found = true;
            // ans = root;
            return root;
        }

        if(root == p){
            return p;
        }

        if(root == q){
            return q ;
        }

        return root;
    }
}





Refine Approach 


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root ==  q) return root ; // base case 
        // logic : if we found any node equals p || q then just return the root

        TreeNode left = lowestCommonAncestor(root.left , p , q);
        TreeNode right = lowestCommonAncestor(root.right , p , q);

        if(left!= null && right != null) return root;

        if(left!= null ){
            return left;
        }else{
            return right;
        }
    }
}
