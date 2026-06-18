// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
       Node head;
       Node tail;
    public myQueue() {
         head=null;
         tail=null;
        
    }

    public boolean isEmpty() {
        return head==null && tail==null;
    }

    public void enqueue(int x) {
        Node newNode=new Node(x);
        if(head==null){
           head=tail=newNode;
           return;
        }else{
             tail.next=newNode;
            tail=tail.next;
        }
    }

    public void dequeue() {
        if(isEmpty()){
            return ;
        }
        
        if(tail==head){
            tail=head=null;
        }else{
            head=head.next;
        }
       
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }
       return head.data;
    }

    public int size() {
          int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
