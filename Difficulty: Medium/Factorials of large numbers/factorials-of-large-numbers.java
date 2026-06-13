class Solution {
    public ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        for(int x = 2; x <= n; x++) {
            int carry = 0;

            for(int i = res.size() - 1; i >= 0; i--) {
                int prod = res.get(i) * x + carry;
                res.set(i, prod % 10);
                carry = prod / 10;
            }

            while(carry > 0) {
                res.add(0, carry % 10);
                carry /= 10;
            }
        }

        return res;
    }
}