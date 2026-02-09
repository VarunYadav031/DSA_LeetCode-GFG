import java.util.Arrays;

class Solution {

    public int mean(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        return sum / n;
    }

    public int median(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        if(n % 2 == 1){
            return arr[n/2];   // odd case
        }
        else{
            return (arr[n/2] + arr[n/2 - 1]) / 2;   // even case
        }
    }
}