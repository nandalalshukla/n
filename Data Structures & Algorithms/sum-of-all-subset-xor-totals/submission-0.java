class Solution {
    int ans = 0;

    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] nums, int index, List<Integer> subset) {
        if (index == nums.length) {
            int xor = 0;
            for (int num : subset) {
                xor ^= num;
            }
            ans += xor;
            return;
        }

        // Include
        subset.add(nums[index]);
        backtrack(nums, index + 1, subset);

        // Exclude
        subset.remove(subset.size() - 1);
        backtrack(nums, index + 1, subset);
    }
}