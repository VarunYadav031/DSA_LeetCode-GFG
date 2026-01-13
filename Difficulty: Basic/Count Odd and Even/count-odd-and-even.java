class Solution {
    public int[] countOddEven(int[] arr) {
        int odd=0;
        int even=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        int []res=new int[2];
        res[0]=odd;
        res[1]=even;
        return res;
    }
}