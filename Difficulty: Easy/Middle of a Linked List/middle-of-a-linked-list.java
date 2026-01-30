/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        if(head==null)return -1;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
        
    }
}
/* 2️⃣ Get Middle (GFG question)

👉 Requirement:
Even length list me second middle return karo*/
/*1️⃣ Insert in Middle (jo upar kiya tha)

👉 Requirement:
Even length list me insert first middle ke baad

Isliye condition:

while (fast.next != null && fast.next.next != null)*/
