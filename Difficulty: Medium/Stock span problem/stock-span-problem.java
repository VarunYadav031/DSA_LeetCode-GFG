class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> span=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        span.add(1);
        stack.push(0);
        for(int i=1;i<arr.length;i++){
            int currprice=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]<=currprice){
                stack.pop();
            }
            if(stack.isEmpty()){
                span.add(i+1);
            }else{
                int prevhigh=stack.peek();
                span.add(i-prevhigh);
            }
            stack.push(i);
        
        }
        return span;
    }
}