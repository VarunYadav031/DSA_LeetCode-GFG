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
       boolean loopfound=false;
       while( fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               loopfound=true;
               break;
           }
       }
       if(!loopfound) return;
       slow=head;
       if(slow==fast){
           while(fast.next!=slow){
               fast=fast.next;
           }
       }
       else{
           while(slow.next!=fast.next){
               slow=slow.next;
               fast=fast.next;
           }
           
       }
      fast.next=null;
    }
}