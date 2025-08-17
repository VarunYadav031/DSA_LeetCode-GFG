class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
    
    if(arr==null || arr.length==0) return 0;
    
        Set<Integer>set=new HashSet<>();
        int n=arr.length;
        for(int val:arr){
            set.add(val);
        }
        int longest=0;
        for(int val:set){
            if(!set.contains(val-1)){
                int currval=val;
                int streak=1;
            
            while(set.contains(currval+1)){
                currval++;
                streak++;
            }
            longest=Math.max(longest,streak);
        }
        }
        return longest;
    }
}