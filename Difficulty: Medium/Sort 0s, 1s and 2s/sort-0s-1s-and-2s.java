class Solution {
    public static void sort012(int[] arr) {
      int n=arr.length;
     int low=0;
     int high=n-1;
     int mid=0;
     while(mid<=high){
         if(arr[mid]==0){
             swap(arr,mid,low);
             low++;
             mid++;
         }else if(arr[mid]==1){
             mid++;
         }
         else{
             swap(arr,mid,high);
             high--;
         }
         
     }
    }
     public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}