class Solution {
    ArrayList<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        bt(0, nums, curr);
        return res;
    }
    private void bt(int i, int[] nums, List<Integer> curr){
        res.add(new ArrayList<>(curr));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            curr.add(nums[j]);
            bt(j+1,nums,curr);
            curr.remove(curr.size()-1);
        }
    }
}
