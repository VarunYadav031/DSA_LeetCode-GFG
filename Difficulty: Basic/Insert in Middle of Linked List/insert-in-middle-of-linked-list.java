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
       Node newnode=new Node(x);
       Node slow=head;
       Node fast=head;
       if(head==null)return newnode;
       
       while(fast.next!=null && fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           
       }
      
       newnode.next=slow.next;
       slow.next=newnode;
       return head;
        
    }
}