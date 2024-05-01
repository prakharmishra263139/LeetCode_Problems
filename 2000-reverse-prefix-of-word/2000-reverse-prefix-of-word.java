class Solution {
    public String reversePrefix(String word, char ch) {
        
        Stack<Character>st =new Stack<>();
        String res="";
        for(int i=0;i<word.length();i++){
            char current = word.charAt(i);
            st.push(current);
            if(current == ch){
                while(!st.isEmpty()){
                    res = res+st.pop();
                }

                res = res+word.substring(i+1,word.length());
            return res;
            }
        }

        return word;
    }
}