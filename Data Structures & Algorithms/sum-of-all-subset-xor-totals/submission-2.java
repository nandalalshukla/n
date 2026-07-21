class Solution {
    int ans = 0;

    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] nums, int start, List<Integer> subset) {

        // Compute XOR of the current subset
        int xor = 0;
        for (int num : subset) {
            xor ^= num;
        }
        ans += xor;

        // Expand the current subset
        for (int i = start; i < nums.length; i++) {

            // Choose
            subset.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, subset);

            // Unchoose
            subset.remove(subset.size() - 1);
        }
    }
}