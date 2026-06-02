class Solution {
    public int getSecondLargest(int[] arr) {
        int lar=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                seclar=lar;
                lar=arr[i];
            }
            else if(arr[i]!=lar && arr[i]>seclar){
                seclar=arr[i];
            
        }
        }
        if(seclar==Integer.MIN_VALUE){
            return -1;
        }
       return seclar;
        
    }
}