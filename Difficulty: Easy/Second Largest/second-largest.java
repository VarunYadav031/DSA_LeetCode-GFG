class Solution {
    public int getSecondLargest(int[] arr) {
        int firstmax=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(firstmax<arr[i]){
                secmax=firstmax;
                firstmax=arr[i];
            }else if(firstmax>arr[i] && secmax<arr[i]){
               secmax=arr[i];
            }
        }
      return secmax;
    }
}