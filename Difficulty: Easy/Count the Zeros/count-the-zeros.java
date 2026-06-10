// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
      int low=0;
      int high=arr.length-1;
      if(arr[arr.length-1]==1)return 0;
      if(arr[0]==0)return arr.length;
      while(low<=high){
          int mid=(low+high)/2;
          if(arr[mid]==0 && arr[mid-1]==1){
              return arr.length-mid;
          }
          if(arr[mid]==1){
              low=mid+1;
          }else{
              high=mid-1;
          }
          
      }
       return 0; 
    }
}
