class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> stack = new HashSet<>();
        for (Integer num : nums) {
            if (stack.contains(num)) {
                stack.remove(num);
            } else {
                stack.add(num);
            }
        }
        Iterator<Integer> res = stack.iterator();
        return res.next();
    }
}