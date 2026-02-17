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
        if(head==null){
            return new Node(x);
        }
        Node newNode=new Node(x);
        
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        newNode.next=slow.next;
        slow.next=newNode;
        return head;
        
    }
}