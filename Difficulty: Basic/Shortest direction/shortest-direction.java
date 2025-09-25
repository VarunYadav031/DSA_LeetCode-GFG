// User function Template for Java

class Solution {
    String shortestPath(String S) {
       int x=0;
       int y=0;
       for(int i=0;i<S.length();i++){
           char dir=S.charAt(i);
           if( dir=='S'){
               y--;
           }else if(dir=='N'){
               y++;
           }else if(dir=='W'){
               x--;
           }else{
               x++;
           }
       }
        StringBuilder sb = new StringBuilder();

        // Lexicographic order: E, N, S, W
        if (x > 0) sb.append("E".repeat(x));
        if (y > 0) sb.append("N".repeat(y));
        if (y < 0) sb.append("S".repeat(-y));
        if (x < 0) sb.append("W".repeat(-x));

        return sb.toString();
        
    }
}