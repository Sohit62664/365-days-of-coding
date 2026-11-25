/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int cnt0 = 0 ;
        int cnt1 = 0 ;
        int cnt2 = 0 ;
        
        Node temp = head;
        while(temp!= null){
            if(temp.data == 0){
                cnt0++;
            }else if(temp.data== 1){
                cnt1++;
            }else{
                cnt2++;
            }
            
            temp = temp.next ;
        }
        
        Node dummy = new Node(-1);
        temp = dummy;
        
        for(int i =0 ; i< cnt0 ; i++){
            Node t = new Node(0);
            temp.next = t;
            temp = temp.next;
        }
        for(int i =0 ; i< cnt1 ; i++){
            Node t = new Node(1);
            temp.next = t;
            temp = temp.next;
        }
        for(int i =0 ; i< cnt2 ; i++){
            Node t = new Node(2);
            temp.next = t;
            temp = temp.next;
        }
        
        return dummy.next;
    }
}
