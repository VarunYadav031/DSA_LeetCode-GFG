class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
       ArrayList<Integer>span=new ArrayList<>();
       Stack<Integer>s=new Stack<>();
       
       
       for(int i=0;i<arr.length;i++){
           int currprice=arr[i];
           while(!s.isEmpty() && currprice>=arr[s.peek()]){
               s.pop();
           }
           if(s.isEmpty()){
               span.add(i+1);
           }else{
               int prevhigh=s.peek();
               span.add(i-prevhigh);
           }
           s.push(i);
       }
        return span;
    }
}