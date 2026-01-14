class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int freq:map.values()){
            ans.add(freq);
        }
        return ans;
    }
}
