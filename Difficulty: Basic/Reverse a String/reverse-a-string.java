// User function Template for Java

class Solution {
    public static String reverseString(String s) {
      char[] arr=s.toCharArray();
      StringBuilder sb=new StringBuilder();
      for(int i=arr.length-1;i>=0;i--){
          sb.append(arr[i]);
      }
       return sb.toString(); 
    }
}