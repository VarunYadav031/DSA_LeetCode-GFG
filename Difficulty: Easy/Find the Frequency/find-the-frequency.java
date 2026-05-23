class Solution {
    int findFrequency(int arr[], int x) {
        int countfreq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                countfreq +=1;
            }
        }
       return  countfreq;
    }
}