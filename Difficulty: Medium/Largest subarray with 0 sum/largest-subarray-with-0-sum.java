class Solution {
    int maxLength(int arr[]) {
        
        int maxlen=0;
		int sum=0;
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int j=0;j<arr.length;j++){
		    map.put(0,-1);
		    sum +=arr[j];
		    if(map.containsKey(sum)){
		        maxlen=Math.max(maxlen,j-map.get(sum));
		    }else{
		        map.put(sum,j);
		    }
		}
        return maxlen;
    }
}