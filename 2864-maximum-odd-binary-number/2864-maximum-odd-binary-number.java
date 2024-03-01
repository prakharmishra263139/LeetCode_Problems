class Solution {
    public String maximumOddBinaryNumber(String s) {
        

        int count =0;

        StringBuilder st  =new StringBuilder();

        for(char c: s.toCharArray()){
            if(c == '1'){
                count++;
            }
        }


        for(int i=0;i<s.length()-1;i++){
            if(count > 1){
                count--;
                st.append('1');
            }else{
                st.append('0');
            }
        }

        st.append('1');

        return st.toString();
    }
}