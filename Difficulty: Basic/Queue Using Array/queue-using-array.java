class myQueue {
    int[]arr;
         int size;
         int rear;
         int front;

    
    public myQueue(int n) {
        // Define Data Structures
        arr=new int[n];
            size=n;
            rear=-1;
            front=-1;

    }

    public boolean isEmpty() {
        // Check if queue is empty
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        // Check if queue is full
         return (rear+1)%size==front;

    }

    public void enqueue(int x) {
        // Enqueue
           if(isFull()){
                // System.out.print("Queue is full");
                return;
            }
            //add first element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=x;

    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()) {
        // System.out.print("Queue is Empty");
        return ;
       }

        int result = arr[front];

          // remove last element
        if(rear == front) {
           rear = front = -1;
        } else {
        front = (front + 1) % size;
        }

         
        

    }

    public int getFront() {
        // Get front element
         if(isEmpty()){
                // System.out.print("Queue is Empty");
                return -1;
            }
            return arr[front];
            
        }

    

    public int getRear() {
        // Get last element
         if(isEmpty()) {
        // System.out.println("Queue is Empty");
        return -1;
    }

    return arr[rear];
        
    }
}
