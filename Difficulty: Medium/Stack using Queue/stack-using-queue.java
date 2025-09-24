class myStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x) {
        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.peek());
            q2.poll();
        }
    }

    int pop() {
         if (q1.isEmpty()) return -1;
       return  q1.poll();
        
    }

    int top() {
         if (q1.isEmpty()) return -1;
        return q1.peek();
    }

    int size() {
       return q1.size();
    }
}
