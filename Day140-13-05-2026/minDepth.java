/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // int min = In/teger.MAX_VALUE;
    int minDepth(Node root) {
        
        // four bace caces 
        
        if (root== null ) return 0 ; // impety tree
        
        if(root.left== null && root.right == null)  return 1 ; // it's a Leafe Node
        
        if(root.left == null) return minDepth(root.right)+1;
        
        if(root.right == null) return minDepth(root.left)+1;
        
        return Math.min(minDepth(root.left), minDepth(root.right)) +1 ;
    }
    
    
}
