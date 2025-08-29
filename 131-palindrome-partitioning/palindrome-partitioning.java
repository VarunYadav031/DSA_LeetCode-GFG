import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> current, List<List<String>> result) {
        // Base case: string khatam ho gayi
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Har possible substring check karo
        for (int end = start; end < s.length(); end++) {
            String substring = s.substring(start, end + 1);

            // Agar palindrome hai toh aage recursion
            if (isPalindrome(substring)) {
                current.add(substring);
                backtrack(s, end + 1, current, result);
                current.remove(current.size() - 1); // backtrack
            }
        }
    }

    // Palindrome check function
    private boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
