/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */



// premirror root -> Right ->left

class Solution {

    int preIndex = 0;

    public Node constructBinaryTree(int[] pre, int[] preMirror) {
        int n = pre.length;

        if (n == 0)
            return null;

        return construct(pre, preMirror, 0, n - 1);
    }

    Node construct(int[] pre, int[] preMirror, int l, int r) {

        if (preIndex >= pre.length || l > r)
            return null;

        Node root = new Node(pre[preIndex++]);

        if (l == r || preIndex >= pre.length)
            return root;

        // Next preorder element is root of left subtree
        int next = pre[preIndex];

        // Find it in mirror preorder
        int index = l;

        while (index <= r && preMirror[index] != next) {
            index++;
        }

        root.left = construct(pre, preMirror, index, r);
        root.right = construct(pre, preMirror, l + 1, index - 1);

        return root;
    }
}
