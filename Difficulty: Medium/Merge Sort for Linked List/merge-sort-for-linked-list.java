/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(0);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                 temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null){
             temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head) {
        // code here
        if(head==null || head.next==null)return head;
        //step.1:-find mid
        Node mid=findmid(head);
        Node righthead=mid.next;
        mid.next=null;
        //again call merge sort
        Node newleft=mergeSort(head);
        Node newright=mergeSort(righthead);
        //merge
        return merge(newleft, newright);
        
        
    }
}