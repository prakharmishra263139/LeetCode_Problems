class Solution {
    public boolean repeatedSubstringPattern(String s) {
     String st = s+s;

     String st1 = st.substring(1,st.length()-1);

     return st1.contains(s);
    }
}