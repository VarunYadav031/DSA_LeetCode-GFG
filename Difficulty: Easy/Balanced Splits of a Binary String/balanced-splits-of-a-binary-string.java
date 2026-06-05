class Solution {
    public static int maxSubStr(String s) {
        int zero=0;
        int one=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero++;
            }else{
                one++;
            }
            if(zero==one){
                count++;
                zero=0;
                one=0;
            }
            
        }
        if(zero!=one){
                return -1;
        }
        return count;
    }
}