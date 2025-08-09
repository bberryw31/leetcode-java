class Solution {
    public boolean isPowerOfTwo(int n) {
        long base = 1;
        while (base <= n) {
            System.out.println(base);
            if (base == n) {
                return true;
            }
            base *= 2;
        }
        return false;
    }
}