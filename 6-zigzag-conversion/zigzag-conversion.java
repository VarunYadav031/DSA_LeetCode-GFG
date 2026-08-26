class Solution {
    public String convert(String s, int numRows) {
        
        // Agar sirf 1 row hai ya string chhoti hai
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        int direction = 1; // 1 = down, -1 = up

        for (char ch : s.toCharArray()) {
            rows[row].append(ch);

            // Top par pahunch gaye -> neeche jaana
            if (row == 0) {
                direction = 1;
            }

            // Bottom par pahunch gaye -> upar jaana
            if (row == numRows - 1) {
                direction = -1;
            }

            row += direction;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder sb : rows) {
            result.append(sb);
        }

        return result.toString();
    }
}