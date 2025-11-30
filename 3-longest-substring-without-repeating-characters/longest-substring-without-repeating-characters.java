class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character>ans=new ArrayList<Character>();
        int start=0;
        int end=0;
        int max_length=0;
        while(end<s.length()){
          if(!ans.contains(s.charAt(end))){
            ans.add(s.charAt(end));
           max_length=Math.max(max_length,ans.size());
            end++;
            
            
          }else{
           ans.remove(Character.valueOf(s.charAt(start)));
            start++;
          }
        }
        return max_length;
    }
}