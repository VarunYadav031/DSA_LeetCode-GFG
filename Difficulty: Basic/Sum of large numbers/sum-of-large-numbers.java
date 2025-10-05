// User function Template for Java

class Solution {
    public String add(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int num1 = 0;
            int num2 = 0;

            if (i >= 0) {
                num1 = s1.charAt(i) - '0';
            }

            if (j >= 0) {
                num2 = s2.charAt(j) - '0';
            }

            int sum = num1 + num2 + carry;
            sb.append(sum % 10); // add current digit
            carry = sum / 10;    // update carry

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
