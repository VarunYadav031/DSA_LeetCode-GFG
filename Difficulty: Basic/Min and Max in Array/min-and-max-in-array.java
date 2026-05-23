class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]<min){
             min=arr[i];
         }
         if(arr[i]>max){
             max=arr[i];
         }
     }
     ArrayList<Integer>ans=new ArrayList<>();
     ans.add(min);
     ans.add(max);
     return ans;
        
    }
}
