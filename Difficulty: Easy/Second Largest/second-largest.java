class Solution {
    public int getSecondLargest(int[] arr) {
        int lar=-1;
        int seclar=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                seclar=lar;
                lar=arr[i];
            }
            else if(arr[i]!=lar && arr[i]>seclar){
                seclar=arr[i];
            }
        }
       return seclar;
        
    }
}