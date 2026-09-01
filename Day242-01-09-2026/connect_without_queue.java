/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        //Without using queue

        if(root == null) return root ;
        Node leftnode = root;

        while(leftnode.left!=null){
            Node curr = leftnode ;
            while(curr!= null){
                // connecting with the same paent 
                curr.left.next = curr.right;

                // connection With Diffrent parents 
                if(curr.next!= null){
                    curr.right.next = curr.next.left ;
                }

                curr = curr.next;

            }
            leftnode = leftnode.left;
        }
        return root;
    }
}
