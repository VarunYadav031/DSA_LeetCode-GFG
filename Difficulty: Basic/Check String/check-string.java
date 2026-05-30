// User function Template for Java

class Sol {
    Boolean check(String s) {
       char first=s.charAt(0);
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=first){
               return false;
           }
       }
        return true;
    }
}