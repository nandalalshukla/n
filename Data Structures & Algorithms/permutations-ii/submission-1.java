class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        pu(nums, new ArrayList<>(),visited);
        return res;
    }
    private void pu(int[] nums, List<Integer> perm, boolean[] visited){
        if(perm.size()==nums.length){
            res.add(new ArrayList<>(perm));
            return;

        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]|| i>0 && nums[i]==nums[i-1] && !visited[i-1]) continue;
            visited[i]= true;
            perm.add(nums[i]);
            pu(nums,perm,visited);
            visited[i]=false;
            perm.remove(perm.size()-1);
        }
    }
}