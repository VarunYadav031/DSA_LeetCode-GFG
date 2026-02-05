// User function Template for Java

import java.util.Arrays;

class Solution {
    Long maxTripletProduct(Long arr[], int n) {
        Arrays.sort(arr);

        // Product of 3 largest numbers
        long prod1 = arr[n - 1] * arr[n - 2] * arr[n - 3];

        // Product of 2 smallest (possibly negative) and largest number
        long prod2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(prod1, prod2);
    }
}
