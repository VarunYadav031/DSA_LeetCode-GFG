class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = (rev << 1) | (n & 1); // shift rev and add last bit of n
            n = n >>> 1;                 // unsigned right shift
        }
        return rev;
    }
}
