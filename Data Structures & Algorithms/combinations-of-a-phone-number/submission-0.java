class Solution {
    private List<String> res = new ArrayList<>();
        private String[] digitToChar = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        bt(0,"",digits);
        return res;
    }
    private void bt(int i, String currStr, String digits){
        if(currStr.length()==digits.length()){
            res.add(currStr);
            return;
        }
        String chars = digitToChar[digits.charAt(i)-'0'];
        for(char c: chars.toCharArray()){
            bt(i+1,currStr+c,digits);
        }
    }
}
