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

        Queue<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = true;
        if (root == null)
            return ans;
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                list.add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            if (!flag) {
                reverse(list, size);
                flag = true;
            } else {
                flag = false;
            }

            ans.add(list);
        }

        return ans;

    }

    void reverse(List<Integer> list, int n) {
        int i = 0;
        int j = n - 1;

        while (i < j) {

            //This will not work because it wwill just get the element 

            // int temp = list.get(i);
            // list.get(i)=list.get(j);
            // list.get(j)= temp ;
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        return;
    }
}
