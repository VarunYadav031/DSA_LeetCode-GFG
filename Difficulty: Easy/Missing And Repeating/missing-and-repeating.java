class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;

        long sumN = (long) n * (n + 1) / 2;
        long sqsumN = (long) n * (n + 1) * (2L * n + 1) / 6;

        long actualSumArr = 0;
        long actualSqSumArr = 0;

        for (int num : arr) {
            actualSumArr += num;
            actualSqSumArr += (long) num * num;
        }

        long diff = actualSumArr - sumN; // x - y
        long diffSq = actualSqSumArr - sqsumN; // x^2 - y^2

        long sum = diffSq / diff; // x + y

        long x = (diff + sum) / 2; // repeating
        long y = x - diff;         // missing

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) x); // repeating
        ans.add((int) y); // missing
        return ans;
    }
}
