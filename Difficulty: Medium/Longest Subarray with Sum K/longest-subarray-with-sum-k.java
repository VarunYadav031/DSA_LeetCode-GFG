// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
       int n=arr.length;
       
       int maxlen=0;
       int currsum=0;
       HashMap<Integer,Integer>result=new HashMap<>();
       for(int i=0;i<n;i++){
           currsum +=arr[i];
           if(currsum-k==0){
              maxlen=i+1;
           }
           if(result.containsKey(currsum-k)){
               maxlen=Math.max(maxlen,i-result.get(currsum-k));
              
           }
            if (!result.containsKey(currsum)) {
                result.put(currsum, i);
            }
       }
       return maxlen;
    }
}
