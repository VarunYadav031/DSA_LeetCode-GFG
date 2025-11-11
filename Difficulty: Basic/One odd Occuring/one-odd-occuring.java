class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
    //   for(int i=0;i<arr.length;i++){
    //       int count=0;
    //       for(int j=0;j<arr.length;j++)
    //           if(arr[i]==arr[j])
    //           count++;
    //       if(count%2!=0)
    //           return arr[i]; 
           
    //   }
    //   return -1;
    int result=arr[0];
    for(int i=1;i<arr.length;i++)
        result=result^arr[i];
       
    
  return result;
}
}