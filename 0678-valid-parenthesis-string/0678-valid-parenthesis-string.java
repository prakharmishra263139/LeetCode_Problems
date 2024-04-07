class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> open = new Stack<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open.push(i);
            }else if(ch=='*'){
                st.push(i);
            }else{
                if(!open.isEmpty()){
                    open.pop();
                }else if(!st.isEmpty()){
                    st.pop();
                }else{
                  return false; 
                }
            }
        }

        while(!open.isEmpty()){
            if(st.isEmpty()){
                return false;
            }

            int openindex= open.pop();
            int closeindex = st.pop();

            if(openindex>closeindex){
                return false;
            }
        }

        return open.isEmpty();
    }
}