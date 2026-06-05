class Solution {
    int maxSubstring(String s) {
        int maxDiff=-1;
        int zero=0;
        int one=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero++;
            }else{
                one++;
            }
            maxDiff=Math.max(maxDiff,zero-one);
            if(one>zero){
                one=0;
                zero=0;
            }
        }
        return maxDiff;
    }
}