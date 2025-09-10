/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
       Node slow=head;
       Node fast=head;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast) {
               break;
           }
       }
           if(slow!=fast) return;
           slow=head;
           Node prev=null;
           if(fast==slow){
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;  // break loop
        } else {
           while(slow!=fast){
               slow=slow.next;
               prev=fast;
               fast=fast.next;
           }
           prev.next=null;
       
        }  
    }
}