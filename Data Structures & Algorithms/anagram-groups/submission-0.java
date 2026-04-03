class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ga= new HashMap<>();
        for(String s: strs){
            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String ss= new String(arr);
            ga.putIfAbsent(ss, new ArrayList<String>());
            ga.get(ss).add(s);
        }
        return new ArrayList<>(ga.values());
    }
}
