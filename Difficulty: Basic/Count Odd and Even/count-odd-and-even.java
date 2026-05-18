class Solution {
    public int[] countOddEven(int[] arr) {
        int count_odd=0;
        int count_even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count_even +=1;
            }else{
                count_odd +=1;
            }
        }
        return new int[]{count_odd,count_even};
    }
}