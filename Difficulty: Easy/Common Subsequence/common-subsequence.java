class Sol {
    boolean commonSubseq(String a, String b) {
        int[] freq = new int[26];  // store lowercase letters

        // Mark characters in 'a' (case-insensitive)
        for(int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));
            if(ch >= 'a' && ch <= 'z') {
                freq[ch - 'a'] = 1;
            }
        }

        // Check characters in 'b' (case-insensitive)
        for(int i = 0; i < b.length(); i++) {
            char ch = Character.toLowerCase(b.charAt(i));
            if(ch >= 'a' && ch <= 'z' && freq[ch - 'a'] == 1) {
                return true;  // common subsequence exists
            }
        }

        return false;  // no common character
    }
}