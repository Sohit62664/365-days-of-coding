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
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> ql = new LinkedList<>();
        Queue<TreeNode> qr = new LinkedList<>();

        if (root != null && root.left != null && root.right != null) {
            if (root.left.val != root.right.val) {
                return false;
            }
            ql.offer(root.left);
            qr.offer(root.right);
        } else if ((root != null && root.left == null && root.right != null) || root != null && root.left != null
                && root.right == null) {
            return false;
        } else {
            return true;
        }

        while (!ql.isEmpty() && !qr.isEmpty()) {
            int lsize = ql.size();
            int rsize = qr.size();
            if (lsize != rsize) {
                return false;
            }

            for (int i = 0; i < lsize; i++) {
                TreeNode nodel = ql.poll();
                TreeNode noder = qr.poll();

                if (nodel.left != null)
                    ql.offer(nodel.left);
                if (nodel.right != null)
                    ql.offer(nodel.right);

                if (noder.right != null)
                    qr.offer(noder.right);
                if (noder.left != null)
                    qr.offer(noder.left);

                if (nodel.left != null && noder.right != null) {
                    if (nodel.left.val != noder.right.val) {
                        return false;
                    }
                } else {
                    if (nodel.left == null && noder.right != null) {
                        return false;
                    }

                    if (nodel.left != null && noder.right == null) {
                        return false;
                    }
                }

                if (nodel.right != null && noder.left != null) {
                    if (nodel.right.val != noder.left.val) {
                        return false;
                    }
                } else {
                    if (nodel.right == null && noder.left != null) {
                        return false;
                    }

                    if (nodel.right != null && noder.left == null) {
                        return false;
                    }
                }

            }

        }

        return true;
    }
}
