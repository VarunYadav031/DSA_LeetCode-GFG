class Solution {
    boolean twoSum(int arr[], int target) {
        int n= arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(target-num)){
                return true;
            }
            set.add(num);
        }
        return false;
        
    }
}