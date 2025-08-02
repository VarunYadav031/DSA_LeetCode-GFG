class Solution {
    // Swap function for array elements
    private void swapIfGreater(int[] a, int[] b, int i, int j) {
        if (a[i] > b[j]) {
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
        }
    }

    public void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int gap = (n + m) / 2 + (n + m) % 2;

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < n + m) {
                // Case 1: i in a, j in a
                if (i < n && j < n) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
                // Case 2: i in a, j in b
                else if (i < n && j >= n) {
                    swapIfGreater(a, b, i, j - n);
                }
                // Case 3: i in b, j in b
                else {
                    if (b[i - n] > b[j - n]) {
                        int temp = b[i - n];
                        b[i - n] = b[j - n];
                        b[j - n] = temp;
                    }
                }

                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}
