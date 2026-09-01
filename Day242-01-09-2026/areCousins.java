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
