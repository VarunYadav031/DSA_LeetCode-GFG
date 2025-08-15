class Solution {
    int maxSubarraySum(int[] arr) {
       
       int n=arr.length;
       int max=Integer.MIN_VALUE;
       int sum=0;
       for(int i=0;i<n;i++){
           
           sum=Math.max(arr[i],sum+arr[i]);
           max=Math.max(sum,max);
           
       }
       return max;
        
    }
}
