class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int num: nums){
            s.add(num);
        }
        int l=0;
        for(int num: s){
            if(!s.contains(num-1)){
                int currL=1;
                while(s.contains(num+currL)){
                   currL++;
                }
                l= Math.max(l,currL);
            }
        }
        return l;
    }
}
