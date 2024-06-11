class Solution {
    public int scoreOfParentheses(String s) {
        int score=0;
        
        Stack<Integer> st  =new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(score);
                score=0;
            }else{
                score = st.pop()+Math.max(score*2,1);
            }
        }
      return score;
    }
}