class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int Len1= expandFromCenter(s,i,i+1);
            int Len2= expandFromCenter(s,i,i);
            int Len=Math.max(Len1,Len2);
            if(end-start<Len){
                start=i-(Len-1)/2;
                end=i+Len/2;
            }
        }
        return s.substring(start,end+1);
      
    }
   int expandFromCenter(String s,int i,int j){
    while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
        i--;
        j++;
    }
    return j-i-1;
   }
}