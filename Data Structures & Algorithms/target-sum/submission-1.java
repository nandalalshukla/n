class Solution {
    HashMap<String,Integer> mp;
    public int findTargetSumWays(int[] nums, int target) {
        mp = new HashMap<>();
        return dfs(0,nums,target,0);
    }
    private int dfs(int i, int[] nums, int target, int total){
        if(i==nums.length){
              return total==target?1:0;
        }
        if(i>nums.length) return 0;
        String key = i+"-"+total;
        if(mp.containsKey(key)) return mp.get(key);
        int x = dfs(i+1,nums, target,total-nums[i]);
        int y =dfs(i+1,nums, target, total+nums[i]);
        mp.put(key,x+y);
        return mp.get(key);
    }
}
