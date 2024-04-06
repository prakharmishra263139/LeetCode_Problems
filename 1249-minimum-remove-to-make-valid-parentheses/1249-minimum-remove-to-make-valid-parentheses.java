class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st =new Stack<>();
        int  n=s.length();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);

            if(ch=='('){
                st.push(i);
            }else if(ch==')'){
                if(st.isEmpty()  ||s.charAt(st.peek())==')'){
                    st.push(i);
                }else if(!st.isEmpty()  && s.charAt(st.peek())=='('){
                    st.pop();
                }
            }
        }

        StringBuilder str =new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()==i){
                st.pop();
                continue;
            }

            str.insert(0,s.charAt(i));

        }
        return str.toString();


    }
}