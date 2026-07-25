/* Structure of Binary Tree Node
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
}*/
class Solution {
    int maxl= 1 ;
    public int longestConsecutive(Node root) {
        // code here
        
        helper(root , 1 );
        if(maxl > 1 ){
            return maxl;
        }else{
            return -1 ; 
            
        }
    }
    
    void helper(Node root , int length ){
        if(root == null) return ;
        
        if(root.left!=null && root.data+1 == root.left.data){
            
            maxl= Math.max(length+1 , maxl);
            helper(root.left , length+1 );
        }else{
            
            helper(root.left , 1 );
        }
        
        
        
        if(root.right!=null && root.data+1 == root.right.data){
            maxl= Math.max(length+1 , maxl);
            helper(root.right , length+1 );
        }else{
            
            helper(root.right , 1 );
        }
         
        
        
    }
}
