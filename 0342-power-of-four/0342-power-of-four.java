class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        double exponent = Math.log(n) / Math.log(4);
        int res = (int) exponent;
        return n == Math.pow(4, res);
    }
}