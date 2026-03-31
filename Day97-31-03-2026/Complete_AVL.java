public class AVL {

    private class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    // Correct constructor (remove return type)
    public AVL() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums) {

        populateSorted(nums, 0, nums.length - 1);

    }

    private void populateSorted(int[] nums, int st, int end) {
        if (st > end)
            return;

        int mid = st + (end - st) / 2;
        insert(nums[mid]);
        populateSorted(nums, st, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }
        // Duplicate is not allowed they simply ignored

        // update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // Left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                // Left - Left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                // Left - Right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            // Right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                // right - right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                // right - Left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;

        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return p;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
