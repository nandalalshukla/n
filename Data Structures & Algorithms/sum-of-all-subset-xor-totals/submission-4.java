class Solution {
    int sum =0;
    public int subsetXORSum(int[] nums) {
        bt(0,nums, new ArrayList<>());
        return sum;
    }
    private void bt(int i, int[] nums,List<Integer> subset){
        int currentXor=0;
        for(int n:subset){
            currentXor^=n;
        }
        sum+=currentXor;
        for(int x=i;x<nums.length;x++){
            subset.add(nums[x]);
            bt(x+1,nums,subset);
            subset.remove(subset.size()-1);
        }
    }
}