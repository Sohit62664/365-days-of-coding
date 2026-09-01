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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Go with level order treversal make the list and reverse the list in zig zag way 

        Deque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = true;
        if (root == null)
            return ans;
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                if (flag) {
                    TreeNode node = q.pollFirst();
                    list.add(node.val);

                    if (node.left != null) {
                        q.offerLast(node.left);
                    }

                    if (node.right != null) {
                        q.offerLast(node.right);
                    }
                    
                } else {
                    TreeNode node = q.pollLast();
                    list.add(node.val);
                    if (node.right != null) {
                        q.offerFirst(node.right);
                    }

                    if (node.left != null) {
                        q.offerFirst(node.left);
                    }

                    
                }               

            }
            flag = !flag;

            ans.add(list);
        }

        return ans;

    }

    
}
