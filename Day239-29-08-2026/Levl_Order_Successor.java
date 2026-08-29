
public class Levl_Order_Successor {
    static int los(TreeNode root, int num) {
        if (root == null) {
            return -1;
        }

        Queue<TreeNode> q = new ArrayDeque<>();

        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null) {
                q.offer(curr.left);
            }

            if (curr.right != null) {
                q.offer(curr.right);
            }
            if (curr.val == num) {
                if (!q.isEmpty())
                    return q.poll().val;
                ;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        System.out.println(root.left.val);

    }
}
