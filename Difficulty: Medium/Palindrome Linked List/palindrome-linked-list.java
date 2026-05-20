/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        if(head==null || head.next==null)return true;;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node curr=slow.next;
        slow.next=null;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        Node first=head;
        Node second=prev;
        while(second!=null){
            if(first.data!=second.data){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    
}