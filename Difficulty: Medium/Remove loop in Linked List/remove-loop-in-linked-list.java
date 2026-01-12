/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        if(head==null)return;
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
          if(slow==fast){
              break;
          }
      }
      if(slow!=fast) return;
      slow=head;
     Node prev=null;
     if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
     while(fast!=slow){
         prev=fast;
         fast=fast.next;
         slow=slow.next;
     }
      prev.next=null;
        
    }
}