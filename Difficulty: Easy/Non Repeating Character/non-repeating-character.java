class Solution {
    public char nonRepeatingChar(String s) {
        int[] freq = new int[26];
        // char[] arr = s.toCharArray();

        // // Count frequency
        // for (int i = 0; i < arr.length; i++) {
        //     char c = arr[i];
        //     freq[c - 'a']++;
        // }

        // // Find first non-repeating char
        // for (int i = 0; i < arr.length; i++) {
        //     char c = arr[i];
        //     if (freq[c - 'a'] == 1) {
        //         return c;
        //     }
        // }

        // return '$';
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(freq[c-'a']==1){
                return c;
            }
        }
        return '$';
    }
}
