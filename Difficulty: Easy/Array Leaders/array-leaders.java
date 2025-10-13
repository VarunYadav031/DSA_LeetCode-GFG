class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int large = arr[n - 1];
        ans.add(large);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= large) {
                large = arr[i];
                ans.add(large);
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}
