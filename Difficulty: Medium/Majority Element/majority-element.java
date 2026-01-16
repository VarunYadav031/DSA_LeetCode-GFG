class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
            if(ans.get(arr[i])>arr.length/2){
                return arr[i];
            }
        }
        return -1;
        
    }
}