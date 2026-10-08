class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for(char c:(path+"/").toCharArray()){
            if(c=='/'){
                if(curr.toString().equals("..")){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }else if(!curr.toString().equals("") && !curr.toString().equals(".")){
                    st.push(curr.toString());
                }

                curr.setLength(0);

            }else{
                curr.append(c);
            }

        }
        return "/"+String.join("/",st);
    }
}