class Solution {
    public String makeGood(String s) {
       
       StringBuilder st =new StringBuilder();

       for(char ch : s.toCharArray()){
         int len = st.length();
         if(len>0 && Math.abs(st.charAt(len-1)-ch)==32){
            st.deleteCharAt(len-1);
         }else{
            st.append(ch);
         }
       }

       return st.toString();
    }
}