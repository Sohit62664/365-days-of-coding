/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
        int size = 0;
    public int getSize(Node root) {
        // code here
        // dfs 
        dfs(root);
        return size;
    }
    void dfs(Node node){
        if(node==null) return ;
        size++;
        dfs(node.left);
        dfs(node.right);
    }
}
