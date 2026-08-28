/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        ArrayDeque<Node> q = new ArrayDeque<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            Node curr= q.poll();
            ans.add(curr.data);
            
            if(curr.left!=null){
                q.offer(curr.left);
            }
            
            if(curr.right!= null){
                q.offer(curr.right);
            }
        }
        
        return ans;
    }
}
