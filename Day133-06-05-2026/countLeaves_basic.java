/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int leaf = 0 ;
    int countLeaves(Node node) {
        // Your code
        dfs(node);
        return leaf;
    }
    
    void dfs(Node node){
        if(node==null) return ;
        dfs(node.left);
        dfs(node.right);
        if(node.left == null && node.right == null){
            leaf++;
        }
    }
}
