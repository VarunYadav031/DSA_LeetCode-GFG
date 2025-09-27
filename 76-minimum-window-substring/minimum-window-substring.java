import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // frequency map of characters in t
        HashMap<Character, Integer> freqmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
        }

        int ucc = freqmap.size(); // unique char count that must be matched
        int startindx = -1;
        int windowstart = 0;
        int windowend = 0;
        int minlen = Integer.MAX_VALUE;
        int N = s.length();

        while (windowend < N) {
            // Expansion phase
            char ch = s.charAt(windowend);
            if (freqmap.containsKey(ch)) {
                freqmap.put(ch, freqmap.get(ch) - 1);
                if (freqmap.get(ch) == 0) {
                    ucc--;
                }
            }

            // Shrinking phase
            while (ucc == 0) {
                int len = windowend - windowstart + 1;
                if (len < minlen) {
                    minlen = len;
                    startindx = windowstart;
                }

                char leftChar = s.charAt(windowstart);
                if (freqmap.containsKey(leftChar)) {
                    freqmap.put(leftChar, freqmap.get(leftChar) + 1);
                    if (freqmap.get(leftChar) > 0) {
                        ucc++;
                    }
                }
                windowstart++;
            }
            windowend++;
        }

        if (startindx == -1) {
            return "";
        }
        return s.substring(startindx, startindx + minlen);
    }
}
