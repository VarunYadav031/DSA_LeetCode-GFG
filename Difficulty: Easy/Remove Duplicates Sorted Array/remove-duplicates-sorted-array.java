class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int n=arr.length;
        result.add(arr[0]);
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[j-1]){
                result.add(arr[j]);
            }
        }
        return result;
    }
}
