class Solution {
    int maxSubarraySum(int[] arr) {
        int n=arr.length;
       int []prefix=new int[n];
       prefix[0]=arr[0];
       int ans=prefix[0];
       for(int i=1;i<n;i++){
           prefix[i]=Math.max(prefix[i-1]+arr[i],arr[i]);
          ans= Math.max(ans,prefix[i]);
       }
        return ans;
    }
}
