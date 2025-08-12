class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> nums_count = new HashMap<>();
        for (Integer num : nums) {
            if (nums_count.get(num) != null) {
                return true;
            } else {
                nums_count.put(num, 1);
            }
        }
        return false;
    }
}