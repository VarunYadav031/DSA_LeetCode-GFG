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
        Node curr=head;
        Node next;
        Node newNode=new Node(x);
        if(head==null) return newNode;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
       return  head;
    }
}