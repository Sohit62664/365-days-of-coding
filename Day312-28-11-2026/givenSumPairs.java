/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        Node tail = head ;
        
        while(tail.next!= null){
            tail = tail.next;
        }
        
        
        while(head != null && tail!= null && !(tail == head || tail.next == head || head.prev == tail) ){
            int h1 = head.data;
            int t1 = tail.data;
            
            int sum = h1+t1;
            
            if(sum == target){
                ans.add(new ArrayList<Integer>(Arrays.asList(h1 , t1)));
                tail = tail.prev ;
                head = head.next ;
            }else if(sum > target ){
                tail= tail.prev ;
            }else {
                head = head.next ;
            }
        }
        
        return ans;
    }
}
