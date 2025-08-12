class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        int sum=0;
        int len=0;
        map.put(0, -1);
        for(int i=0;i<n;i++){
            sum +=arr[i];
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return len;
    }
}