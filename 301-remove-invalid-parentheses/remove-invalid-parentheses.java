import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) return result;

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(s);
        visited.add(s);
        boolean found = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();

                if (isValid(str)) {
                    result.add(str);
                    found = true; // minimum removal level mil gaya
                }

                if (found) continue; // aur deeper level me jaane ki need nahi

                for (int j = 0; j < str.length(); j++) {
                    char c = str.charAt(j);
                    if (c != '(' && c != ')') continue; // sirf parentheses remove karo

                    String next = str.substring(0, j) + str.substring(j + 1);
                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.add(next);
                    }
                }
            }
            if (found) break; // BFS ka level complete karne ke baad stop
        }

        return result;
    }

    // Validity check (O(N))
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else if (c == ')') {
                if (count == 0) return false;
                count--;
            }
        }
        return count == 0;
    }
}
