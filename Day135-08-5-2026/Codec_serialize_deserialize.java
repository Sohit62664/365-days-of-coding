/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    int i= 0;
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper1(root, sb);
        return sb.toString();
    }

    void helper1(TreeNode node, StringBuilder sb) {

        if (node == null) {
            sb.append("null,");
            return;
        }

        sb.append(node.val).append(",");

        helper1(node.left, sb);
        helper1(node.right, sb);
    }


    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return helper2(arr);
    }

    TreeNode helper2(String[] arr) {

        if (i >= arr.length || arr[i].equals("null")) {
            i++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr[i++]));

        root.left = helper2(arr);
        root.right = helper2(arr);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
