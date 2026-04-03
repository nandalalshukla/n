class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int temp1= st.pop();
                int temp2= st.pop();
                st.push(temp1+temp2);
            }
            else if(tokens[i].equals("-")){
                int temp1= st.pop();
                int temp2= st.pop();
                st.push(temp2-temp1);
            }else if(tokens[i].equals("*")){
                int temp1= st.pop();
                int temp2= st.pop();
                st.push(temp1*temp2);
            }else if(tokens[i].equals("/")){
                int temp1= st.pop();
                int temp2= st.pop();
                st.push(temp2/temp1);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}
