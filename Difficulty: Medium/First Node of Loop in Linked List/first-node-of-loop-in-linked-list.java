/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        Node slow=head;
        Node fast=head;
        if(head==null)return -1;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
               break;
            }
        }
        if(fast==null || fast.next==null){
            return -1;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
       return slow.data; 
    }
}