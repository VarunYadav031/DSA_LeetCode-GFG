class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        ArrayList<String>result=new ArrayList<>();
        if(words.length==0)return result;
        result.add(words[0]);
        int prev=0;
        int curr=1;
        while(curr<words.length){
            if(!isAnagram(words[prev],words[curr])){
               
                result.add(words[curr]);
                prev=curr;
               
            }
             curr++;
        }
        return result;
    }
        private boolean isAnagram(String w1,String w2){
            char[]a=w1.toCharArray();
            char[]b=w2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a,b);

    }
}