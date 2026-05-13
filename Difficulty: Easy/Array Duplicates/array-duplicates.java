class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(!set.contains(num)){
                set.add(num);
            }else{
                ans.add(num);
            }
        }
        return ans;
    }
}