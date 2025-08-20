/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newnode=new Node(x);
        if(head==null){
            return newnode;
        }
         Node temp=head;
       
        Node slow=head,fast=head.next;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
          newnode.next=slow.next;
          slow.next=newnode;
          return head;
          
        
        
    }
}