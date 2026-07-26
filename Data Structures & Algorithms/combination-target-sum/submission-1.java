class Solution {
    ArrayList<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res= new ArrayList<>();
        backtrack(nums, 0,new ArrayList<>(),0,target );
        return res;
    }
    private void backtrack(int[] nums, int i,List<Integer> curr, int total, int target){
        if(total==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i>=nums.length || total>target) return;
        curr.add(nums[i]);
        backtrack(nums,i,curr,total+nums[i],target);
        curr.remove(curr.size()-1);
        backtrack(nums,i+1,curr,total,target);
    }
}
