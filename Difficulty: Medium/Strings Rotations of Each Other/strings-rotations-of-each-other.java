class Solution {

    public static boolean areRotations(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        String text = s1 + s1;
        return kmpSearch(text, s2);
    }

    static boolean kmpSearch(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        int[] lps = new int[m];
        computeLPS(pattern, lps);

        int i = 0, j = 0;

        while (i < n) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m)
                return true;

            else if (i < n && text.charAt(i) != pattern.charAt(j)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        return false;
    }

    static void computeLPS(String pat, int[] lps) {

        int len = 0;
        int i = 1;

        while (i < pat.length()) {

            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {

                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}