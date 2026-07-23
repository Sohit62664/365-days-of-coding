/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/



/*
Preorder -> root -> left -> right 
inorder -> left -> root -> right 
postorder -> left -> right-> root

*/


class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> ans = new ArrayList<>();
        Solver(root , ans );
        
        return ans ; 
        
        
        
    }
    
    void Solver(Node root , ArrayList<Integer> ans ){
        if(root == null ) return ; 
        ans.add(root.data);
        Solver(root.left, ans );
        Solver(root.right, ans );
        
        
    }
}
