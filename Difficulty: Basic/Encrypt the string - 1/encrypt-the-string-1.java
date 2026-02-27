class Solution {
    String encryptString(String s) {
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        
        while(i < n){
            
            char ch = s.charAt(i);
            int count = 0;
            
            // Count same consecutive characters
            while(i < n && s.charAt(i) == ch){
                count++;
                i++;
            }
            
            sb.append(ch);
            sb.append(count);
        }
        sb.reverse();
        
        return sb.toString();
    }
}