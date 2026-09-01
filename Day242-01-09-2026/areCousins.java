/* Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};*/
class Solution {
    public boolean areCousins(Node root, int x, int y) {
        // code here
        Deque<Node> q = new ArrayDeque<>();

        if (root == null) {
            return false;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            boolean xx = false;
            boolean yy = false;
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }

                if(curr.left!= null && curr.right!= null){
                    if(curr.left.data == x && curr.right.data == y){
                        return false ;
                    }else if(curr.left.data == y && curr.right.data == x){
                        return false;
                    }
                }

                if (curr.data == x) {
                    xx = true;
                } else if (curr.data == y) {
                    yy = true;
                }

            }

            if(xx & yy) return true;
        }

        return false;

    }
}


//Approach 02 

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
    public boolean isCousins(TreeNode root, int x, int y) {

        TreeNode xx = getNode(root, x);
        TreeNode yy = getNode(root, y);
        return (level(root, xx, 0) == level(root, yy, 0) && !isSibling(root, xx, yy));
    }

    TreeNode getNode(TreeNode root, int x) {
        if (root == null)
            return root;

        if (root.val == x)
            return root;

        TreeNode n = getNode(root.left, x);
        if (n != null)
            return n;

        return getNode(root.right, x);
    }

    boolean isSibling(TreeNode root, TreeNode x, TreeNode y) {
        if (root == null)
            return false;

        if (root.left == x && root.right == y) {
            return true;
        } else if (root.left == y && root.right == x) {
            return true;
        }

        boolean result = isSibling(root.left, x, y);
        if (result)
            return result;
        return isSibling(root.right, x, y);
    }

    int level(TreeNode root, TreeNode xx, int l) {
        if (root == null)
            return 0;

        if (root == xx)
            return l;

        int n = level(root.left, xx, l + 1);
        if (n != 0)
            return n;
        return level(root.right, xx, l + 1);
    }

}
