import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int len=s.length();
        int freq[]=new int[26];
       int indexS=0;
       int indexT=0;
       while(indexS<len && indexT<len){
        char charS=s.charAt(indexS);
        int freqIndexS=charS-97;
        freq[freqIndexS]+=1;

        char charT=t.charAt(indexT);
        int freqIndexT=charT-97;
        freq[freqIndexT]-=1;
        indexS++;
        indexT++;
       }
       for(int i=0;i<26;i++){
        if(freq[i]!=0){
            return false;
        }
       }
       return true;
       
          
    }

   
}
