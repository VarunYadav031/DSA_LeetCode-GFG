class Solution {
    public char getMaxOccuringChar(String s) {
         if(s.length() == 0){
            return ' ';   // empty case handle
        }
      int []freq=new int[26];
      int i=0;
      int n=s.length();
      while(i<n){
          char ch=s.charAt(i);
          freq[ch-'a']++;
          i++;
      }
     
      int max=0;
      char result='a';
      for(i=0;i<freq.length;i++){
          if(freq[i]>max){
              max=freq[i];
              result=(char)(i+'a');
          }
      }
      return result;
      }
      
    
}