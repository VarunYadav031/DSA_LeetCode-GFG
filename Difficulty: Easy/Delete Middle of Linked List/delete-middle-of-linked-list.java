/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
     if(head==null || head.next==null){
         return null;
     }
     if(head.next.next==null){
         head.next=null;
         return head;
     }
   
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            
            
        }
        prev.next=slow.next;
        return head;
    }
}