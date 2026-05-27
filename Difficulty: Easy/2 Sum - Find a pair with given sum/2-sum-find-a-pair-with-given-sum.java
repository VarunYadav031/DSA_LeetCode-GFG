// User function Template for Java
class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(target-num)){
                ans.add(target-num);
                ans.add(num);
            }else{
                set.add(num);
            }
        }
        return ans;
        
    }
}