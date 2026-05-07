class Solution {

    public boolean isSubTree(Node root1, Node root2) {

        if(root2 == null) return true;
        if(root1 == null) return false;

        // check current node
        if(isSame(root1, root2)) {
            return true;
        }

        // search left or right
        return isSubTree(root1.left, root2) ||
               isSubTree(root1.right, root2);
    }

    boolean isSame(Node node1, Node node2) {

        if(node1 == null && node2 == null) return true;

        if(node1 == null || node2 == null) return false;

        if(node1.data != node2.data) return false;

        return isSame(node1.left, node2.left) &&
               isSame(node1.right, node2.right);
    }
}








// 186 testcases passed
class Solution {
    Node root = null;

    public boolean isSubTree(Node root1, Node root2) {

        if(root2 == null) return true;

        helper(root1 , root2);

        if(root != null){
            return helper2(root , root2);
        }else{
            return false;
        }
    }

    void helper(Node node1 , Node node2){

        if(node1 == null) return; // added
        if(node2 == null) return;

        // compare data not reference
        if(node1.data == node2.data){
            root = node1;
            return;
        }

        helper(node1.left ,node2);
        helper(node1.right ,node2);
    }

    boolean helper2(Node node1 , Node node2 ){

        if(node1 == null && node2 == null) return true;

        // fixed
        if(node1 == null || node2 == null) return false;

        // compare data not reference
        if(node1.data != node2.data) return false;

        boolean left1 = helper2(node1.left , node2.left);
        boolean right1 = helper2(node1.right , node2.right);

        return (left1 && right1);
    }
}
