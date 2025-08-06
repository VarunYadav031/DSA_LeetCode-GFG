class Solution {
    int majorityElement(int arr[]) {
        // code here
          int n=arr.length;
          int ans=0;
          int freq=0;
          for(int i=0;i<n;i++){
              if(freq==0){
                  ans=arr[i];
              }
              if(ans==arr[i]){
                  freq++;
              }else {
                  freq--;
              }
             
          }
          int count=0;
          for(int val:arr){
              if(val==ans){
                  count++;
              }
          }
          if(count>n/2){
              return ans;
          }else{
              return -1;
          }
     
    }
}