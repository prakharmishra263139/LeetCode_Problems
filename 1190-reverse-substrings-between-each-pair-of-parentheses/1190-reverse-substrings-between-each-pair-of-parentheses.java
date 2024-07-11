class Solution {
    public String reverseParentheses(String s) {
        
        Stack<String> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(res.toString());
                res.setLength(0);
            }else if(ch==')'){
                res.reverse();
                res.insert(0,st.pop());
            }else{
                res.append(ch);
            }
        }

        return res.toString();
    }
}