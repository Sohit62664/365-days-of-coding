/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null) return result ;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Double> level  = new ArrayList<>();
            for(int i =0 ; i<size ; i++){
                TreeNode node = q.poll();
                level.add((double)node.val);

                if(node.left!= null ) q.offer(node.left);
                if(node.right!= null ) q.offer(node.right);
            }
            double sum =  0.000000 ;
            for(int i =0 ; i< level.size() ; i++){
                sum+= level.get(i);
            }
            double avg = sum/ size;
            result.add(avg);
        }

        return result;
    }
}
