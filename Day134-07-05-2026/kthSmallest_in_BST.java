// best approach without using list 

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
    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;
    }

    void helper(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        helper(root.left, k);
        count++;
        if (count == k) {
            ans = root.val;
        }

        helper(root.right, k);
    }
}




//........................The Simplest Aproach
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
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        Collections.sort(list);
        return list.get(k-1);
    }

    void helper(TreeNode root){
        if(root == null ) return ;
        list.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}




//............................................................... but In order treversal will directly give a Sorted array so ............................................


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
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        return list.get(k-1);
    }

    void helper(TreeNode root){
        if(root == null ) return ;
        
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}

