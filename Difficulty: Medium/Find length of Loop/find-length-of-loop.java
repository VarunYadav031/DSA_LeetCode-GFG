/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        if(head==null)return 0;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               Node temp=slow.next;
               int count =1;
               while(temp!=slow){
                   temp=temp.next;
                   count +=1;
               }
                 return count;
            }
            
        }
       
        return 0;
    }
}