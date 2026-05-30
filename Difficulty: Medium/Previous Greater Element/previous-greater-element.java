class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
       int n=arr.length;
       ArrayList<Integer>ans=new ArrayList<>();
       Stack<Integer>result=new Stack<>();
       for(int i=0;i<arr.length;i++){
           while(!result.isEmpty()&& result.peek()<=arr[i]){
               result.pop();
           }
           if(result.isEmpty()){
               ans.add(-1);
           }else{
               ans.add(result.peek());
           }
           result.push(arr[i]);
       }
        return ans;
    }
}