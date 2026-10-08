class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c!=']'){
                st.push(String.valueOf(c));
            }else{
                String temp ="";
                while(!st.peek().equals("[") ){
                    temp=st.pop()+temp;
                }
                st.pop();
                String num = "";
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    num=st.pop()+num;
                }
                String res ="";
                int reps = Integer.parseInt(num);
                while(reps>0){
                    res+=temp;
                    reps--;
                }
                st.push(res);
            }

        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}