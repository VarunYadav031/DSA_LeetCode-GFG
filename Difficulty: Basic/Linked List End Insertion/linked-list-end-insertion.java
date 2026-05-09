/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newnode=new Node(x);
        Node curr=head;
        if(head==null){
            return newnode;
        }
        while(curr.next!=null){
            curr=curr.next;
            
        }
        curr.next=newnode;
        return head;
        
    }
}