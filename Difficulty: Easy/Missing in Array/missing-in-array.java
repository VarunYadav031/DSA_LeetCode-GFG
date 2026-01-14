class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
       long totalsum=(long)n*(n+1)/2;
       int actualsum=0;
       for(int i=0;i<arr.length;i++){
           actualsum +=arr[i];
       }
      return  (int)totalsum-actualsum;
        
    }
}