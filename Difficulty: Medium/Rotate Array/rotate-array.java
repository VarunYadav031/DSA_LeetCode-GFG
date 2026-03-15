class Solution {
    static void rotateArr(int arr[], int d) {
       int n=arr.length;
       d=d%n;    // if n=5 ,d=2
       reverse(arr,0,d-1);
       reverse(arr,d,n-1);
       reverse(arr,0,n-1);
        
        
    }
     static void reverse(int arr[],int i, int j) {
           int n=arr.length;
           
          
           while(i<j){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
           }
       }
}