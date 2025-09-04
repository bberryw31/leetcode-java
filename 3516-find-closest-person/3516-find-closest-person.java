class Solution {
    public int findClosest(int x, int y, int z) {
        int x_distance = Math.abs(x - z);
        int y_distance = Math.abs(y - z);
        if (x_distance > y_distance) { 
            return 2;
        } else if (x_distance < y_distance) {
            return 1;
        } else {
            return 0;
        }
    }
}