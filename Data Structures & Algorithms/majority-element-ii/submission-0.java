class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res= new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int occurence= nums.length/3;
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getValue()>occurence) res.add(e.getKey());

        }
        return res;
    }
}