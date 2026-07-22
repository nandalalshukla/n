class Solution {
    List<List<Integer>> res; 
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates, 0,0,target,curr);
        return res;
    }
    private void backtrack(int[] nums,int i, int total,int target, List<Integer> curr){
        if(total==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            if(total+nums[j]>target) break;
            curr.add(nums[j]);
            backtrack(nums,j+1,total+nums[j],target,curr);
            curr.remove(curr.size()-1);
        }
    }
}
