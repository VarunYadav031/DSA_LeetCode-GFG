/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
       if(head==null || k==0)return head;
       
       int len=1;
       Node temp=head;
       while(temp.next!=null){
           
           temp=temp.next;
           len+=1;
       }
       k=k%len;
        if (k == 0) return head;
       int count=1;
       Node curr=head;
      while(count<k ){
          curr=curr.next;
          count +=1;
      }
    
       Node newHead=curr.next;
       curr.next=null;
       temp.next=head;
       return newHead;
    }
}