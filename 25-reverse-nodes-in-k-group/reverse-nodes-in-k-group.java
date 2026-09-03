/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int len(ListNode head){
        int counter=0;
        ListNode temp=head;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
        return counter;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int N=len(head);
        int groups=N/k;
        ListNode prevHead=null;
        ListNode currHead=head;
        ListNode ansnode=null;
        for(int i=0;i<groups;i++){
            ListNode curr=currHead;
            ListNode prev=null;
            ListNode next=null;
            for(int j=0;j<k;j++){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            if(prevHead==null){
                ansnode=prev;
            }else{
              prevHead.next=prev;
            }
            prevHead=currHead;
            currHead=curr;
        }
        prevHead.next=currHead;
        return ansnode;
    }
}